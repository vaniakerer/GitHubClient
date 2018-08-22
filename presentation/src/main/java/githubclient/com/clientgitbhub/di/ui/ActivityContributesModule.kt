package githubclient.com.clientgitbhub.di.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import githubclient.com.clientgitbhub.di.app.ExecutionModule
import githubclient.com.clientgitbhub.di.data.FoldersDataModule
import githubclient.com.clientgitbhub.di.scope.ActivityScope
import githubclient.com.clientgitbhub.di.ui.main.MainActivityModule
import githubclient.com.clientgitbhub.ui.module.main.MainActivity

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
@Module
abstract class ActivityContributesModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class,
        FoldersDataModule::class
    ])
    internal abstract fun mainActivityInjector(): MainActivity
}
