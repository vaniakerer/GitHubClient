package githubclient.model

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
data class UserModel(
        val login: String,
        val id: Long,
        val avatarUrl: String
)