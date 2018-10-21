package githubclient.com.clientgitbhub.ui.module.main.detail

import githubclient.com.clientgitbhub.model.mapper.RepoisitoriesViewModelMapper
import githubclient.com.clientgitbhub.observer.BasePresentationSingleObserver
import githubclient.com.clientgitbhub.ui.module.base.BaseViewPresenter
import githubclient.interactor.RepositoriesInteractor
import githubclient.model.RepositoryModel
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  21/10/2018
 */
class RepositoryDetailPresenter @Inject constructor(
        val repositoriesInteractor: RepositoriesInteractor,
        val repositoryViewModelMapper: RepoisitoriesViewModelMapper
) : BaseViewPresenter<RepoDetailContract.View>(), RepoDetailContract.Presenter {

    override fun attachView(view: RepoDetailContract.View) {
        super.attachView(view)
        loadRepository(123)//todo stub repositoryId
    }

    private fun loadRepository(repositoryId: Long) {
        repositoriesInteractor.getRepository(
                object : BasePresentationSingleObserver<RepositoryModel>(view!!) {
                    override fun onSuccess(value: RepositoryModel) {
                        super.onSuccess(value)
                        view?.showRepository(repositoryViewModelMapper.transform(value))
                    }
                },
                repositoryId
        )
    }
}