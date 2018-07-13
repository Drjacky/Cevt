package ir.hosseinabbasi.cevt.ui.weather

import io.reactivex.Observable
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
import ir.hosseinabbasi.cevt.ui.base.IBaseInteractor

/**
 * Created by Dr.jacky on 7/14/2018.
 */
interface IWeatherInteractor : IBaseInteractor{
    fun getWeather(params: Map<String, String>): Observable<WeatherResponse>
}