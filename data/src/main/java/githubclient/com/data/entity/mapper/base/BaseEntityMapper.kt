package githubclient.com.data.entity.mapper.base

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
abstract class BaseEntityMapper<Entity, Model> {
    abstract fun transform(entity: Entity): Model

    public fun transformList(entityList: List<Entity>) = entityList.map { transform(it) }

}