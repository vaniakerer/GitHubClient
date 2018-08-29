package githubclient.com.clientgitbhub.ui.module.main

import githubclient.com.clientgitbhub.observer.BasePresentationSingleObserver
import githubclient.com.clientgitbhub.ui.module.base.BaseViewPresenter
import githubclient.interactor.FoldersInteractor
import githubclient.model.RepositoryModel
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  17/08/2018
 */
class MainPresenter @Inject constructor(val foldersInteractor: FoldersInteractor) :
        BaseViewPresenter<MainContract.View>(), MainContract.Presenter {
    override fun attachView(view: MainContract.View) {
        super.attachView(view)
        loadFolders()
    }

    private fun loadFolders() {
        foldersInteractor.getFolders(
                object : BasePresentationSingleObserver<List<RepositoryModel>>(view!!) {
                    override fun onSuccess(value: List<RepositoryModel>) {
                        super.onSuccess(value)
                        view?.showErrorMessage(value.size.toString())
                    }
                }
        )
    }
}