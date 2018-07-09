package ir.hosseinabbasi.cevt.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import ir.hosseinabbasi.cevt.di.qualifier.ActivityContext

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

}