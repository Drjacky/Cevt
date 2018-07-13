package ir.hosseinabbasi.cevt.ui.weather

import io.reactivex.Observable
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
import ir.hosseinabbasi.cevt.data.network.IApiService
import ir.hosseinabbasi.cevt.ui.base.BaseInteractor
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/13/2018.
 */
class WeatherInteractor @Inject
constructor(apiService: IApiService) : BaseInteractor(apiService), IWeatherInteractor{
    override fun getWeather(params: Map<String, String>): Observable<WeatherResponse> {
        return getApiService().getWeather(params)
    }
}