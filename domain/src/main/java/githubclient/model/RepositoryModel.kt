package githubclient.model

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
data class RepositoryModel(
        val id: String,
        val name: String,
        val user : UserModel
)