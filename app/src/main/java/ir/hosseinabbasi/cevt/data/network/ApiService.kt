package ir.hosseinabbasi.cevt.data.network

import io.reactivex.Observable
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
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

    override fun getWeather(params: Map<String, String>): Observable<WeatherResponse> {
        return mRetrofit.create(INetworkApi::class.java).getWeather(params)
    }
}
