package ir.hosseinabbasi.cevt.data.network

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
class ApiService @Inject
constructor(retrofit: Retrofit) : IApiService{
    private val mRetrofit = retrofit

    override fun getWeather(params: Map<String, String>) {
        mRetrofit.create(IApiService::class.java).getWeather(params)
    }
}
