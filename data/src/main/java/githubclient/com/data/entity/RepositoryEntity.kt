package githubclient.com.data.entity

import com.google.gson.annotations.SerializedName

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
data class RepositoryEntity(
        @SerializedName("id") val id: String,
        @SerializedName("name") val name: String,
        @SerializedName("owner") val owner: UserEntity
)