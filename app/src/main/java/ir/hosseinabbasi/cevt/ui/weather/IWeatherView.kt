package ir.hosseinabbasi.cevt.ui.weather

import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
import ir.hosseinabbasi.cevt.ui.base.IBaseView

/**
 * Created by Dr.jacky on 7/13/2018.
 */
interface IWeatherView : IBaseView{
    fun loadWeather(weather: WeatherResponse)
}