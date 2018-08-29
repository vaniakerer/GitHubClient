package githubclient.com.data.entity.mapper

import javax.inject.Inject

import githubclient.com.data.entity.UserEntity
import githubclient.com.data.entity.mapper.base.BaseEntityMapper
import githubclient.model.UserModel

/**
 * @author Ivan Kerer
 * @since 28/08/2018
 */
class UserEntityMapper @Inject constructor() : BaseEntityMapper<UserEntity, UserModel>() {
    override fun transform(userEntity: UserEntity): UserModel {
        return UserModel(
                userEntity.login,
                userEntity.id,
                userEntity.avatarUrl
        )
    }
}
