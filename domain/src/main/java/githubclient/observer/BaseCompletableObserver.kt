package githubclient.observer

import io.reactivex.observers.DisposableCompletableObserver

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class BaseCompletableObserver : DisposableCompletableObserver() {
    override fun onComplete() {

    }

    override fun onError(e: Throwable?) {
    }

}