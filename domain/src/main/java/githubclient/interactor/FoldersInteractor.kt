package githubclient.interactor

import githubclient.executor.PostExecutionThread
import githubclient.executor.ThreadExecutor
import githubclient.interactor.base.BaseInteractor
import githubclient.model.RepositoryModel
import githubclient.observer.BaseSingleObserver
import githubclient.repository.FoldersRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class FoldersInteractor @Inject constructor(
        val foldersRepository: FoldersRepository,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread,
        compositeDisposable: CompositeDisposable
) : BaseInteractor(
        threadExecutor,
        postExecutionThread,
        compositeDisposable

) {
    fun getFolders(observer: BaseSingleObserver<List<RepositoryModel>>) {
        execute(foldersRepository.getFolders(), observer)
    }
}