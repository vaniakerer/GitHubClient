package githubclient.executor

import io.reactivex.Scheduler

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
interface PostExecutionThread {
    fun getScheduler(): Scheduler
}