package githubclient.com.clientgitbhub.ui.module.main

import android.os.Bundle
import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.ui.module.base.BaseActivity

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    override fun getLayoutRes() = R.layout.activity_main

    override fun configureView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}