package githubclient.com.data.factory.base

import githubclient.com.data.source.db.base.BaseDbDataSource
import githubclient.com.data.source.local.base.BaseLocalDataSource
import githubclient.com.data.source.network.datasource.base.BaseApiDataSource

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class BaseDataSourceFactory<ApiDataSource : BaseApiDataSource<Any>, DbDataSource : BaseDbDataSource,
        LocalDataSource : BaseLocalDataSource>
constructor(
        val apiDataSource: ApiDataSource,
        val dbDataSource: DbDataSource,
        val localDataSource: LocalDataSource
)
