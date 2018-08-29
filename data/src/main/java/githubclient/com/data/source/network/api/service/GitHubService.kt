package githubclient.com.data.source.network.api.service

import githubclient.com.data.entity.RepositoryEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
interface GitHubService {
    @GET("/users/{userName}/repos")
    fun getRepos(@Path("userName") userName: String): Single<List<RepositoryEntity>>
}