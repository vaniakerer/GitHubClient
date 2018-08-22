package githubclient.com.clientgitbhub.ui.module.base

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
open class BaseViewPresenter<V : BaseContract.BaseView> : BaseContract.BasePresenter<V> {

    protected var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

}