package githubclient.com.clientgitbhub.ui.module.main

import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.ui.module.base.BaseContract

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
interface MainContract {

    interface View : BaseContract.BaseView{
        fun showRepositories(repositories : List<RepositoryViewModel>)
    }

    interface Presenter : BaseContract.BasePresenter<View>
}