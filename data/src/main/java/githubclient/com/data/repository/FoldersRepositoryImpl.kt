package githubclient.com.data.repository

import githubclient.repository.FoldersRepository
import io.reactivex.Single


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class FoldersRepositoryImpl constructor() : FoldersRepository {
    override fun getFolders() = Single.just("Test!!!")
}