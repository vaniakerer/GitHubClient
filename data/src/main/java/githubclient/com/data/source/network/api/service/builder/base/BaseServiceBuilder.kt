package githubclient.com.data.source.network.api.service.builder.base

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author Ivan Kerer
 * @since  28/08/2018
 */
abstract class BaseServiceBuilder<T> {
    fun build(): T {
        val okHttpClientBuilder = OkHttpClient.Builder()

        okHttpClientBuilder.connectTimeout(30, TimeUnit.SECONDS)
        okHttpClientBuilder.readTimeout(30, TimeUnit.SECONDS)
        okHttpClientBuilder.writeTimeout(30, TimeUnit.SECONDS)

        val logginingInterceptor = HttpLoggingInterceptor()
        logginingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        okHttpClientBuilder.addInterceptor(logginingInterceptor)
/*
        val gsonBuilder = GsonBuilder()
        gsonBuilder.create()*/

        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//todo add custom call adapter factory
                .client(okHttpClientBuilder.build())
                .baseUrl(getBaseUrl())
                .build()
                .create(getServiceClass())
    }
/*

    protected fun configureGson(gsonBuilder: GsonBuilder) {
    }
*/

    private fun getBaseUrl() = "https://api.github.com"//todo hardcode

    protected abstract fun getServiceClass(): Class<T>
}