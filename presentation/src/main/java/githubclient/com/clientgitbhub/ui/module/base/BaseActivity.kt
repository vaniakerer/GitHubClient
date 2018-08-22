package githubclient.com.clientgitbhub.ui.module.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */

abstract class BaseActivity<V : BaseContract.BaseView, P : BaseContract.BasePresenter<V>>
    : AppCompatActivity(), BaseContract.BaseView {

    protected lateinit var presenter: P

    @LayoutRes
    abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
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