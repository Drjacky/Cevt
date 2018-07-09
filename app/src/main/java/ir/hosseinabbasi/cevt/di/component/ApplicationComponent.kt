package ir.hosseinabbasi.cevt.di.component

import android.app.Application
import android.content.res.Resources
import dagger.Component
import ir.hosseinabbasi.cevt.di.module.ApplicationModule
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun exposeResources(): Resources

    fun exposeApplication(): Application

}