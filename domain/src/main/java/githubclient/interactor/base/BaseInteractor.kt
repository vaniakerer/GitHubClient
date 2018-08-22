package githubclient.interactor.base

import githubclient.executor.PostExecutionThread
import githubclient.executor.ThreadExecutor
import githubclient.observer.BaseSingleObserver
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
open class BaseInteractor(
        val threadExecutor: ThreadExecutor?,
        val postExecutionThread: PostExecutionThread?,
        val compositeDisposable: CompositeDisposable?
) {

    fun <T> execute(observable: Single<T>, subsriber: BaseSingleObserver<T>) {
        addDisposable(
                observable
                        .subscribeOn(Schedulers.from(threadExecutor))
                        .observeOn(postExecutionThread?.getScheduler())
                        .subscribeWith(subsriber)
        )

    }

    fun addDisposable(disposable: Disposable) = compositeDisposable?.add(disposable)

    fun dispose() = compositeDisposable?.dispose()
}