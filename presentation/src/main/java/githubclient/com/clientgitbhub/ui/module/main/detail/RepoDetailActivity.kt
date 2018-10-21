package githubclient.com.clientgitbhub.ui.module.main.detail

import android.content.Context
import android.content.Intent
import githubclient.com.clientgitbhub.R
import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.Constants.ExtraKeys.REPOSITORY_ID
import githubclient.com.clientgitbhub.ui.module.base.BaseActivity
import githubclient.com.clientgitbhub.ui.module.base.BaseActivity_MembersInjector

/**
 * @author Ivan Kerer
 * @since  21/10/2018
 */
class RepoDetailActivity : BaseActivity<RepoDetailContract.View, RepoDetailContract.Presenter>(),
        RepoDetailContract.View {

    override fun getLayoutRes() = R.layout.activity_repo_detail

    override fun initViews() {
    }

    override fun configureView() {
    }

    override fun showRepository(repository: RepositoryViewModel) {

    }

    companion object {
        fun performTransaction(context: Context, repositoryId : Long){
            context.startActivity(
                    createIntent<RepoDetailActivity>(context)
                            .putExtra(REPOSITORY_ID, repositoryId)
            )
        }
    }
}
