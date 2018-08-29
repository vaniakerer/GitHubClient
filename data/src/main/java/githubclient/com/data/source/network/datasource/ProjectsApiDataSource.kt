package githubclient.com.data.source.network.datasource

import githubclient.com.data.entity.RepositoryEntity
import githubclient.com.data.source.network.api.service.GitHubService
import githubclient.model.RepositoryModel
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
class ProjectsApiDataSource @Inject constructor(val gitHubService: GitHubService) {

    fun getProjects(): Single<List<RepositoryEntity>> = gitHubService.getRepos("vaniakerer");

}