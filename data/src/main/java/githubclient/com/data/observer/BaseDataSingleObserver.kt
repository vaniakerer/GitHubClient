package githubclient.com.data.observer

import githubclient.com.data.DataApp
import githubclient.com.data.exception.ApiError
import githubclient.observer.BaseSingleObserver
import retrofit2.HttpException

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
open class BaseDataSingleObserver<T> : BaseSingleObserver<T>() {

    override fun onError(throwable: Throwable) {
        super.onError(throwable)

        if (throwable is ApiError)
            onApiError(throwable)
        else if (throwable is HttpException) {
            if (DataApp.isNetworkAviable()) onServerError()
            else onNetworkConnectionError()
        }
    }
    protected open fun onApiError(apiError: ApiError) {}

    protected open fun onNetworkConnectionError() {}

    protected open fun onServerError() {}
}