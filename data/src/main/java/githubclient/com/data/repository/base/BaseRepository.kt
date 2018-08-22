package githubclient.com.data.repository.base

import githubclient.com.data.factory.base.BaseDataSourceFactory

/**
 * @author Ivan Kerer
 * @since  18/08/2018
 */
class BaseRepository<DataSourceFactory : BaseDataSourceFactory<*, *, *>>(val dataSourceFactory:
                                                                         DataSourceFactory)