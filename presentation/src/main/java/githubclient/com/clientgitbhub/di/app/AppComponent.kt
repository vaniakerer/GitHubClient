package githubclient.com.clientgitbhub.di.app

import dagger.Component
import dagger.android.AndroidInjectionModule
import githubclient.com.clientgitbhub.App
import githubclient.com.clientgitbhub.di.ui.ActivityContributesModule
import githubclient.com.clientgitbhub.di.ui.main.MainActivityModule
import javax.inject.Singleton


/**
 * @since  18/08/2018
 */
// AppComponent.java
@Singleton
@Component(modules = [
    AppModule::class,
    AndroidInjectionModule::class,
    ActivityContributesModule::class,
    ExecutionModule::class
])
internal interface AppComponent {
    fun inject(app: App)
}

