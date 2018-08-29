package githubclient.com.data.source.network.api.service.builder

import githubclient.com.data.source.network.api.service.builder.base.BaseServiceBuilder
import githubclient.com.data.source.network.api.service.GitHubService
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
class GitHubServiceBuilder @Inject constructor() : BaseServiceBuilder<GitHubService>() {
    override fun getServiceClass() = GitHubService::class.java

}