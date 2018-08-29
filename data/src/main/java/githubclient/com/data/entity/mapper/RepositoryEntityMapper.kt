package githubclient.com.data.entity.mapper

import githubclient.com.data.entity.RepositoryEntity
import githubclient.com.data.entity.mapper.base.BaseEntityMapper
import githubclient.model.RepositoryModel
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
class RepositoryEntityMapper @Inject constructor(val userEntityMapper: UserEntityMapper)
    : BaseEntityMapper<RepositoryEntity, RepositoryModel>() {

    override fun transform(entity: RepositoryEntity) = RepositoryModel(
            entity.id,
            entity.name,
            userEntityMapper.transform(entity.owner)
    )

}