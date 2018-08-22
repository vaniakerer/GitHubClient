package githubclient.com.clientgitbhub.observer

import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.ui.module.base.BaseContract
import githubclient.com.data.exception.ApiError
import githubclient.com.data.observer.BaseDataSingleObserver

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
open class BasePresentationSingleObserver<T>(private val baseView: BaseContract.BaseView) :
        BaseDataSingleObserver<T>() {

    override fun onStart() {
        super.onStart()
        baseView.setLoading(true)
    }

    override fun onApiError(apiError: ApiError) {
        if (isDisposed) return
        super.onApiError(apiError)
        baseView.setLoading(false)
        baseView.showErrorMessage(apiError.message)
    }

    override fun onServerError() {
        if (isDisposed) return
        super.onServerError()
        baseView.setLoading(false)
        baseView.showErrorMessage(R.string.server_error)
    }

    override fun onNetworkConnectionError() {
        if (isDisposed) return
        super.onNetworkConnectionError()
        baseView.setLoading(false)
        baseView.showErrorMessage(R.string.network_connection_error_message)
    }
}