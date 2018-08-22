package githubclient.observer

import io.reactivex.observers.DisposableObserver

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class BaseObserver<T> : DisposableObserver<T>() {
    override fun onComplete() {

    }

    override fun onNext(value: T) {
    }

    override fun onError(e: Throwable?) {
    }

}