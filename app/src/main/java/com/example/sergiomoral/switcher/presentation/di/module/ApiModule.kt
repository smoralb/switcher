package com.example.sergiomoral.switcher.presentation.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class ApiModule {

    private val TIME_OUT = 120

    /*
    @Provides
    @Singleton
    fun providesNetworkDataSource(networkDataSourceImp: NetworkDataSourceImp): NetworkDataSource {
        return networkDataSourceImp
    }
    @Provides
    @Singleton
    fun provideApiService(
        @EndPoint endpoint: String,
        gsonConverterFactory: GsonConverterFactory,
        okClient: OkHttpClient
    ): ApiService {
        return Retrofit.Builder()
            .baseUrl(endpoint)
            .client(okClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
            .create(ApiService::class)
    }
*/
    @Provides
    @Singleton
    fun provideClient(): OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
            .writeTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
            .readTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
        return okHttpBuilder.build()
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideGsonParser(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }
/*
    @Provides
    @Singleton
    @EndPoint
    fun provideEndpoint(): String {
        return Constants.ENDPOINT
    }
    */
}