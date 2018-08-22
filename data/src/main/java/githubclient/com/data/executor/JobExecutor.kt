package githubclient.com.data.executor

import githubclient.executor.ThreadExecutor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.inject.Inject


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class JobExecutor @Inject constructor() : ThreadExecutor {

    private var threadPoolExecutor: ThreadPoolExecutor = ThreadPoolExecutor(
            3,
            5,
            10,
            TimeUnit.SECONDS,
            LinkedBlockingQueue()
    )

    override fun execute(command: Runnable?) {
        this.threadPoolExecutor.execute(command)
    }

    private class JobThreadFactory : ThreadFactory {
        private var counter = 0

        override fun newThread(runnable: Runnable): Thread {
            return Thread(runnable, "android_" + counter++)
        }
    }

}