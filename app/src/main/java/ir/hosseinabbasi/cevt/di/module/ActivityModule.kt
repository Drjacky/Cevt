package ir.hosseinabbasi.cevt.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import ir.hosseinabbasi.cevt.di.qualifier.ActivityContext
import ir.hosseinabbasi.cevt.di.qualifier.PerActivity
import ir.hosseinabbasi.cevt.ui.main.*
import ir.hosseinabbasi.cevt.ui.weather.*

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Module
class ActivityModule(private val mActivity: Activity) {

    @Provides
    @ActivityContext
    fun provideActivityContext(): Context {
        return mActivity
    }

    @Provides
    fun provideActivity(): Activity {
        return mActivity
    }

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    @PerActivity
    fun provideMainActivityPresenter(presenter: MainActivityPresenter<IMainActivityView, IMainActivityInteractor>):
            IMainActivityPresenter<IMainActivityView, IMainActivityInteractor> {
        return presenter
    }

    @Provides
    @PerActivity
    fun provideMainActivityInteractor(interactor: MainActivityInteractor): IMainActivityInteractor {
        return interactor
    }

    @Provides
    @PerActivity
    fun provideWeatherViewPresenter(presenter: WeatherPresenter<IWeatherView, IWeatherInteractor>):
            IWeatherPresenter<IWeatherView, IWeatherInteractor> {
        return presenter
    }

    @Provides
    @PerActivity
    fun provideWeatherInteractor(interactor: WeatherInteractor): IWeatherInteractor {
        return interactor
    }

}