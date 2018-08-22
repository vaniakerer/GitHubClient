package githubclient.com.clientgitbhub.di.app

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import githubclient.com.clientgitbhub.di.scope.PerActivity
import githubclient.com.clientgitbhub.ui.module.main.MainActivity


/**
 * @author Ivan Kerer
 * @since  19/08/2018
 */
// AppModule.java
@Module(includes = arrayOf(AndroidInjectionModule::class))
internal abstract class AppModule {
    @PerActivity
    @ContributesAndroidInjector
    internal abstract fun mainActivityInjector(): MainActivity
}
