package githubclient.repository

import githubclient.model.RepositoryModel
import io.reactivex.Single

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
interface FoldersRepository {
    fun getFolders(): Single<List<RepositoryModel>>
}