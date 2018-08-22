package githubclient.com.clientgitbhub.ui.module.main

import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import githubclient.com.clientgitbhub.R

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainActivity : DaggerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}