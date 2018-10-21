package githubclient.interactor

import githubclient.executor.PostExecutionThread
import githubclient.executor.ThreadExecutor
import githubclient.interactor.base.BaseInteractor
import githubclient.model.RepositoryModel
import githubclient.observer.BaseSingleObserver
import githubclient.repository.ProjectsRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class RepositoriesInteractor @Inject constructor(
        private val projectsRepository: ProjectsRepository,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread,
        compositeDisposable: CompositeDisposable
) : BaseInteractor(
        threadExecutor,
        postExecutionThread,
        compositeDisposable

) {

    fun getRepositories(observer: BaseSingleObserver<List<RepositoryModel>>) {
        execute(projectsRepository.getProjects(), observer)
    }

    fun getRepository(observer: BaseSingleObserver<RepositoryModel>, repositoryId: Long) {
        execute(projectsRepository.getProject(repositoryId), observer)
    }

}