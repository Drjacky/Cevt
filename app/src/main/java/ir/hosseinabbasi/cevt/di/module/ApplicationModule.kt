package ir.hosseinabbasi.cevt.di.module

import android.app.Application
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @Singleton
    fun provideAppResources(): Resources {
        return mApplication.resources
    }
}