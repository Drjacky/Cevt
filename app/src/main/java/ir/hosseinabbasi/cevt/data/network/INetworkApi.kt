package ir.hosseinabbasi.cevt.data.network

import io.reactivex.Observable
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Created by Dr.jacky on 7/13/2018.
 */
interface INetworkApi {
    @GET("weather")
    fun getWeather(@QueryMap params: Map<String, String>): Observable<WeatherResponse>
}