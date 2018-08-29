package githubclient.com.clientgitbhub.ui.module.main

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.transition.TransitionManager
import android.transition.Visibility
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ProgressBar
import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.adapter.list.RepositoriesListAdapter
import githubclient.com.clientgitbhub.ui.module.base.BaseActivity

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    private lateinit var rvRepositories: RecyclerView
    private lateinit var progressBar: ProgressBar

    private lateinit var repositoriesAdapter: RepositoriesListAdapter

    @LayoutRes
    override fun getLayoutRes() = R.layout.activity_main

    override fun initViews() {
        rvRepositories = findViewById(R.id.rv_main_repositories)
        progressBar = findViewById(R.id.pb_main_repositories)
    }

    override fun configureView() {
        initRecycler()
    }

    override fun showRepositories(repositories: List<RepositoryViewModel>) {
        repositoriesAdapter.setNewData(repositories)
        //todo mb create diffUtil
    }

    override fun setLoading(isLoading: Boolean) {
       /* TransitionManager.beginDelayedTransition(rvRepositories?.parent as ViewGroup?)
        progressBar.visibility = if (isLoading) VISIBLE else GONE
        rvRepositories.visibility = if (isLoading) GONE else VISIBLE*/
    }

    private fun initRecycler() {
        repositoriesAdapter = RepositoriesListAdapter()
        rvRepositories.adapter = repositoriesAdapter
    }
}