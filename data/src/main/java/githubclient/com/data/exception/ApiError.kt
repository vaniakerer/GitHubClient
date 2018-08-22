package githubclient.com.data.exception

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
data class ApiError(val code: Int, override val message: String) : Exception()