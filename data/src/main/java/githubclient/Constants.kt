package githubclient

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
interface Constants {
    interface Api {
        object Endpoints {
            val REPOSITORIES = "/repos"
            val USERS = "/users/"
        }

        object Params{
            val LOGIN = "login"
            val ID = "id"
            val AVATAR_URL = "avatar_url"
        }
    }
}