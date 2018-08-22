package githubclient.com.rx

import githubclient.executor.PostExecutionThread
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

class UIThread @Inject constructor() : PostExecutionThread {
    override fun getScheduler() = AndroidSchedulers.mainThread()!!
}