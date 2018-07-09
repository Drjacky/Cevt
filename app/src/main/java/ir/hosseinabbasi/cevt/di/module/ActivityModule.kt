package ir.hosseinabbasi.cevt.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import ir.hosseinabbasi.cevt.di.qualifier.ActivityContext
import ir.hosseinabbasi.cevt.di.qualifier.PerActivity
import ir.hosseinabbasi.cevt.ui.main.*

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
    fun provideMainInteractor(interactor: MainActivityInteractor): IMainActivityInteractor {
        return interactor
    }

}