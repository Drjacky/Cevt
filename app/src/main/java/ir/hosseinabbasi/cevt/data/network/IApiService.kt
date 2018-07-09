package ir.hosseinabbasi.cevt.data.network

import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface IApiService{
    @GET("weather")
    fun getWeather(@QueryMap params: Map<String, String>)
}