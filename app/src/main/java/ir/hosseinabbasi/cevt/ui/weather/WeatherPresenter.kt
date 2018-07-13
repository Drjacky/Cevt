package ir.hosseinabbasi.cevt.ui.weather

import android.util.Log
import ir.hosseinabbasi.cevt.ui.base.BasePresenter
import ir.hosseinabbasi.cevt.utils.rx.RxDisposableFactory
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/13/2018.
 */
class WeatherPresenter<V : IWeatherView, I : IWeatherInteractor> @Inject
constructor(interactor: I,
            val threadTransformer: ThreadTransformer,
            rxDisposableFactory: RxDisposableFactory) : BasePresenter<V, I>(interactor, threadTransformer, rxDisposableFactory), IWeatherPresenter<V, I> {
    private val disposable = this.mRxDisposables

    override fun getWeather(params: Map<String, String>) {
        mBaseView?.showLoading()

        disposable.add(getInteractor()!!.getWeather(params)
                .map { it }
                .compose(threadTransformer.applySchedulers())
                .subscribe({ weather ->
                    mBaseView?.hideLoading()
                    mBaseView?.loadWeather(weather)
                }
                        , { throwable ->
                    mBaseView?.hideLoading()
                    mBaseView?.onError(throwable.message)
                    Log.wtf(TAG, throwable.message)
                }))
    }

    companion object {
        private val TAG: String = WeatherPresenter::class.java.simpleName
    }
}