package githubclient.com.clientgitbhub.model.mapper

import githubclient.com.clientgitbhub.model.RepositoryViewModel
import githubclient.com.clientgitbhub.model.mapper.base.BaseViewModelMapper
import githubclient.model.RepositoryModel
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
class RepoisitoriesViewModelMapper @Inject constructor()
    : BaseViewModelMapper<RepositoryModel, RepositoryViewModel>() {

    override fun transform(entity: RepositoryModel) = RepositoryViewModel(
            entity.id,
            entity.name,
            entity.user
    )
}