package githubclient.com.data.entity

import com.google.gson.annotations.SerializedName
import githubclient.Constants

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
data class UserEntity(
        @SerializedName("login") val login: String,
        @SerializedName("id") val id: Long,
        @SerializedName("avatar_url") val avatarUrl: String
)