package githubclient.com.clientgitbhub.ui.module.base

import android.support.annotation.StringRes

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
interface BaseContract {

    interface BaseView {

        fun setLoading(isLoading: Boolean)

        fun showErrorMessage(@StringRes messageRes: Int)

        fun showErrorMessage(message: String)

        fun showApiError(message: String);

        fun showApiError(@StringRes messageRes: Int);
    }

    interface BasePresenter<V : BaseView> {

        fun attachView(view: V)

        fun detachView()

    }
}