package ir.hosseinabbasi.cevt.di.module

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ir.hosseinabbasi.cevt.utils.rx.RxDisposables
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import ir.hosseinabbasi.cevt.utils.rx.impl.CompositeDisposablesImpl
import ir.hosseinabbasi.cevt.utils.rx.impl.ViewThreadTransformer
import ir.hosseinabbasi.cevt.utils.rx.impl.WorkThreadTransformer
import ir.hosseinabbasi.cevt.utils.rx.qualifier.IOThreadPref
import ir.hosseinabbasi.cevt.utils.rx.qualifier.UIThreadPref
import ir.hosseinabbasi.cevt.utils.rx.qualifier.WorkThreadTransformerPref
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Module
class UtilsModule {

    @Provides
    @Singleton
    internal fun providesViewThreadTransformer(
            transformer: ViewThreadTransformer): ThreadTransformer {
        return transformer
    }

    @Provides
    @Singleton
    @WorkThreadTransformerPref
    internal fun providesWorkThreadTransformer(
            transformer: WorkThreadTransformer): ThreadTransformer {
        return transformer
    }

    @Provides
    @Singleton
    @IOThreadPref
    internal fun provideIoScheduler(): Scheduler {
        return Schedulers.io()
    }

    @Provides
    @Singleton
    @UIThreadPref
    internal fun provideMainScheduler(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    @Provides
    @Singleton
    fun provideCompositeDisposables(
            disposables: CompositeDisposablesImpl): RxDisposables {
        return disposables
    }
}