package githubclient.interactor

import githubclient.executor.PostExecutionThread
import githubclient.executor.ThreadExecutor
import githubclient.interactor.base.BaseInteractor
import githubclient.observer.BaseSingleObserver
import githubclient.repository.FoldersRepository
import io.reactivex.disposables.CompositeDisposable

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class FoldersInteractor  constructor(
        val foldersRepository: FoldersRepository,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread,
        compositeDisposable: CompositeDisposable
) : BaseInteractor(
        threadExecutor,
        postExecutionThread,
        compositeDisposable

) {
    fun getFolders(observer: BaseSingleObserver<String>) {
        execute(foldersRepository.getFolders(), observer)
    }
}