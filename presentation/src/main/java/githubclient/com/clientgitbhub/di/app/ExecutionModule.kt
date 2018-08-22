package githubclient.com.clientgitbhub.di.app

import dagger.Binds
import dagger.Module
import githubclient.com.data.executor.JobExecutor
import githubclient.com.rx.UIThread
import githubclient.executor.PostExecutionThread
import githubclient.executor.ThreadExecutor
import javax.inject.Singleton

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

@Module
abstract class ExecutionModule {
    @Singleton
    @Binds
    abstract fun providePostExecutionThread(uiThread: UIThread) : PostExecutionThread

    @Singleton
    @Binds
    abstract fun provideThreadExecutor(jobExecutor: JobExecutor) : ThreadExecutor
}