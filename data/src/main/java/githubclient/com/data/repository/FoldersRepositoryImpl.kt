package githubclient.com.data.repository

import githubclient.com.data.entity.mapper.RepositoryEntityMapper
import githubclient.com.data.source.network.datasource.ProjectsApiDataSource
import githubclient.model.RepositoryModel
import githubclient.repository.FoldersRepository
import io.reactivex.Single
import javax.inject.Inject


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class FoldersRepositoryImpl @Inject constructor(
        val projectsApiDataSource: ProjectsApiDataSource,
        val repositoryEntityMapper: RepositoryEntityMapper
) : FoldersRepository {

    override fun getFolders(): Single<List<RepositoryModel>> = projectsApiDataSource
            .getProjects()
            .map { repositoryEntityMapper.transformList(it) }
}