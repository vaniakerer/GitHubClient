package githubclient.com.clientgitbhub.ui.module.main

import githubclient.com.clientgitbhub.observer.BasePresentationSingleObserver
import githubclient.com.clientgitbhub.ui.module.base.BaseViewPresenter
import githubclient.interactor.RepositoriesInteractor
import githubclient.model.RepositoryModel
import githubclient.com.clientgitbhub.model.mapper.RepoisitoriesViewModelMapper
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainPresenter @Inject constructor(
        val repositoriesInteractor: RepositoriesInteractor,
        val repositoryViewModelMapper: RepoisitoriesViewModelMapper
) : BaseViewPresenter<MainContract.View>(), MainContract.Presenter {

    override fun attachView(view: MainContract.View) {
        super.attachView(view)
        loadFolders()
    }

    private fun loadFolders() {
        repositoriesInteractor.getRepositories(
                object : BasePresentationSingleObserver<List<RepositoryModel>>(view!!) {
                    override fun onSuccess(value: List<RepositoryModel>) {
                        super.onSuccess(value)
                        view?.showRepositories(repositoryViewModelMapper.transformList(value))
                    }
                }
        )
    }
}