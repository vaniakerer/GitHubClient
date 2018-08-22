package githubclient.com.rx

import githubclient.executor.PostExecutionThread
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class UIThread constructor() : PostExecutionThread {
    override fun getScheduler() = AndroidSchedulers.mainThread()!!
}