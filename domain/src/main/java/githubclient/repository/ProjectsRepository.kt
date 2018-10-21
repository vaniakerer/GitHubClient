package githubclient.repository

import githubclient.model.RepositoryModel
import io.reactivex.Single

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
interface ProjectsRepository {

    fun getProjects(): Single<List<RepositoryModel>>

    fun getProject(projectId : Long) : Single<RepositoryModel>
}