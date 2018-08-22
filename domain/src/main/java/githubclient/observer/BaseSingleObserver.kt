package githubclient.observer

import io.reactivex.observers.DisposableSingleObserver

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
open class BaseSingleObserver<T> : DisposableSingleObserver<T>() {

    override fun onError(e: Throwable) {
    }

    override fun onSuccess(value: T) {

    }
}