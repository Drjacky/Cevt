package ir.hosseinabbasi.cevt.di.module

import dagger.Module
import dagger.Provides
import ir.hosseinabbasi.cevt.data.network.ApiEndPoint
import ir.hosseinabbasi.cevt.data.network.ApiService
import ir.hosseinabbasi.cevt.data.network.IApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Module
class NetModule {

    @Provides
    @Singleton
    fun provideApiService(apiService: ApiService): IApiService {
        return apiService
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiEndPoint.ENDPOINT_CEVT)
                .build()
    }
}