package githubclient.com.data.repository

import githubclient.com.data.entity.mapper.RepositoryEntityMapper
import githubclient.com.data.source.network.datasource.ProjectsApiDataSource
import githubclient.model.RepositoryModel
import githubclient.repository.ProjectsRepository
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class ProjectsRepositoryImpl @Inject constructor(
        val projectsApiDataSource: ProjectsApiDataSource,
        val repositoryEntityMapper: RepositoryEntityMapper
) : ProjectsRepository {

    override fun getProjects(): Single<List<RepositoryModel>> = projectsApiDataSource
            .getProjects()
            .map { repositoryEntityMapper.transformList(it) }

    override fun getProject(projectId: Long): Single<RepositoryModel> =
            projectsApiDataSource
                    .getProjects()
                    .flatMap { Single.just(it.firstOrNull()) }
                    .map {
                        it?.let { return@map repositoryEntityMapper.transform(it) }
                    }
}