package githubclient.com.clientgitbhub.di.data

import dagger.Module
import dagger.Provides
import githubclient.com.data.repository.FoldersRepositoryImpl
import githubclient.com.data.source.network.api.service.builder.GitHubServiceBuilder
import githubclient.repository.FoldersRepository

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

@Module
class FoldersDataModule {
    @Provides
    fun provideFoldersRepository(repository: FoldersRepositoryImpl): FoldersRepository = repository

    @Provides
    fun provideApiService(gitHubServiceBuilder: GitHubServiceBuilder) = gitHubServiceBuilder.build()
}