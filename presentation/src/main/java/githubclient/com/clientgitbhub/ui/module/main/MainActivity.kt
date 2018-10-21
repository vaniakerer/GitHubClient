package githubclient.com.clientgitbhub.ui.module.main

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.adapter.list.RepositoriesListAdapter
import githubclient.com.clientgitbhub.ui.adapter.list.base.OnItemClickListener
import githubclient.com.clientgitbhub.ui.module.base.BaseActivity
import githubclient.com.clientgitbhub.ui.widget.ProgressView

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View, OnItemClickListener {
    private lateinit var rvRepositories: RecyclerView

    private lateinit var progressView: ProgressView
    private lateinit var repositoriesAdapter: RepositoriesListAdapter

    @LayoutRes
    override fun getLayoutRes() = R.layout.activity_main

    override fun initViews() {
        rvRepositories = findViewById(R.id.rv_main_repositories)
        progressView = findViewById(R.id.pv_main)
    }

    override fun configureView() {
        initRecycler()
    }

    override fun showRepositories(repositories: List<RepositoryViewModel>) {
        rvRepositories.visibility = VISIBLE
        repositoriesAdapter.setNewData(repositories)
    }

    override fun setLoading(isLoading: Boolean) {
        progressView.visibility = if (isLoading) VISIBLE else GONE
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "clicked $position", Toast.LENGTH_SHORT).show()
    }

    private fun initRecycler() {
        repositoriesAdapter = RepositoriesListAdapter()
        rvRepositories.adapter = repositoriesAdapter
        repositoriesAdapter.onItemClickListener = this
    }
}
