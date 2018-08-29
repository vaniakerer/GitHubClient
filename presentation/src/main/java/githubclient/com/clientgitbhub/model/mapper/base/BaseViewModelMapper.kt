package githubclient.com.clientgitbhub.model.mapper.base

/**
 * @author Ivan Kerer
 * @since  29/08/2018
 */
abstract class BaseViewModelMapper<Model, ViewModel> {
    abstract fun transform(entity: Model): ViewModel

    public fun transformList(entityList: List<Model>) = entityList.map { transform(it) }
}