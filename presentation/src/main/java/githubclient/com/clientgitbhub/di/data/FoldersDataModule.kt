package githubclient.com.clientgitbhub.di.data

import dagger.Binds
import dagger.Module
import githubclient.com.clientgitbhub.di.scope.ActivityScope
import githubclient.com.data.repository.FoldersRepositoryImpl
import githubclient.repository.FoldersRepository

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

@Module
abstract class FoldersDataModule {
    @ActivityScope
    @Binds
    abstract fun provideFoldersRepository(repository: FoldersRepositoryImpl): FoldersRepository
}