package githubclient.com.clientgitbhub.ui.module.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.widget.Toast
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */

abstract class BaseActivity<V : BaseContract.BaseView, P : BaseContract.BasePresenter<V>>
    : DaggerActivity(), BaseContract.BaseView {

    @Inject
    protected lateinit var presenter: P

    @LayoutRes
    abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        configureView()
        presenter.attachView(this as V)//todo do something with warning!!!
    }

    abstract fun configureView()

    override fun showErrorMessage(messageRes: Int) {
        showErrorMessage(getString(messageRes))
    }

    override fun showErrorMessage(message: String) {
        Toast
                .makeText(this, message, Toast.LENGTH_SHORT)
                .show()
    }

    override fun setLoading(isLoading: Boolean) {
        //stub
    }

    override fun showApiError(message: String) {

    }

    override fun showApiError(messageRes: Int) {

    }

}