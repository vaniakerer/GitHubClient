package githubclient.com.data.repository

import githubclient.repository.FoldersRepository
import io.reactivex.Single
import javax.inject.Inject


/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class FoldersRepositoryImpl @Inject constructor() : FoldersRepository {
    override fun getFolders() = Single.just("Test!!!")
}