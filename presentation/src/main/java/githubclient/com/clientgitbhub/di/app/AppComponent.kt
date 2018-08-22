package githubclient.com.clientgitbhub.di.app

import dagger.Component
import githubclient.com.clientgitbhub.App
import javax.inject.Singleton


/**
 * @since  18/08/2018
 */
// AppComponent.java
@Singleton
@Component(modules = arrayOf(AppModule::class))
internal interface AppComponent {
    fun inject(app: App)
}

