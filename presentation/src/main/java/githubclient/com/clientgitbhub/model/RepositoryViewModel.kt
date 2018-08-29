package githubclient.com.clientgitbhub.model

import githubclient.model.UserModel

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
data class RepositoryViewModel(
        val id: String,
        val name: String,
        val user : UserModel
)