package githubclient.com.clientgitbhub.di.data

import dagger.Module
import dagger.Provides
import githubclient.com.data.repository.ProjectsRepositoryImpl
import githubclient.com.data.source.network.api.service.builder.GitHubServiceBuilder
import githubclient.repository.ProjectsRepository

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */

@Module
class FoldersDataModule {
    @Provides
    fun provideFoldersRepository(repository: ProjectsRepositoryImpl): ProjectsRepository = repository

    @Provides
    fun provideApiService(gitHubServiceBuilder: GitHubServiceBuilder) = gitHubServiceBuilder.build()
}