package githubclient.com.clientgitbhub.di.app

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


/**
 * @author Ivan Kerer
 * @since  19/08/2018
 */
// AppModule.java
@Module
class AppModule {
    @Provides
    fun provideCompositeDisposable() = CompositeDisposable()
}
