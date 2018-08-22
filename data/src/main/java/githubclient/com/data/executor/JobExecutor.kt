package githubclient.com.data.executor

import githubclient.executor.ThreadExecutor


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
//todo inject
class JobExecutor constructor() : ThreadExecutor {
    override fun execute(command: Runnable?) {

    }

    //todo uncomment
    /* private var threadPoolExecutor: ThreadPoolExecutor = ThreadPoolExecutor(
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
     }*/

}