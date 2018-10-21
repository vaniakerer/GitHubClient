package githubclient.com.clientgitbhub.ui.module.main.detail

import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.module.base.BaseContract

/**
 * @author Ivan Kerer
 * @since  21/10/2018
 */
interface RepoDetailContract {
    interface View : BaseContract.BaseView {
        fun showRepository(repository: RepositoryViewModel)
    }

    interface Presenter : BaseContract.BasePresenter<View>
}