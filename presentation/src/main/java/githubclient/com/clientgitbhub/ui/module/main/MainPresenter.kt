package githubclient.com.clientgitbhub.ui.module.main

import githubclient.com.clientgitbhub.observer.BasePresentationSingleObserver
import githubclient.com.clientgitbhub.ui.module.base.BaseViewPresenter
import githubclient.interactor.FoldersInteractor
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
                object : BasePresentationSingleObserver<String>(view!!) {
                    override fun onSuccess(value: String) {
                        super.onSuccess(value)
                        view?.showErrorMessage(value)
                    }
                }
        )
    }
}