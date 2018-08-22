package githubclient.com.clientgitbhub.di.ui.main

import dagger.Binds
import dagger.Module
import dagger.Provides
import githubclient.com.clientgitbhub.di.scope.ActivityScope
import githubclient.com.clientgitbhub.ui.module.main.MainContract
import githubclient.com.clientgitbhub.ui.module.main.MainPresenter


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

@Module
abstract class MainActivityModule {
    @ActivityScope
    @Binds
    abstract fun provideMainPresenter(mainPresenter: MainPresenter) :MainContract.Presenter
}