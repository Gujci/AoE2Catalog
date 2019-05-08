package com.gujci.aoe2catalog.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideAoEApi(client: OkHttpClient): AoEApi =
            Retrofit.Builder()
                    .client(client)
                    .baseUrl(NetworkConfig.AOE_ENDPOINT_ADDRESS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(AoEApi::class.java)
}