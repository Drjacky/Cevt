package ir.hosseinabbasi.cevt.data.network

import io.reactivex.Observable
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface IApiService{
    fun getWeather(params: Map<String, String>): Observable<WeatherResponse>
}