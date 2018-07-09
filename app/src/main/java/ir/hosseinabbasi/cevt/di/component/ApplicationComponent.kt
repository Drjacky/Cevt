package ir.hosseinabbasi.cevt.di.component

import android.app.Application
import android.content.res.Resources
import dagger.Component
import ir.hosseinabbasi.cevt.data.db.RealmManager
import ir.hosseinabbasi.cevt.di.module.ApplicationModule
import ir.hosseinabbasi.cevt.di.module.DataModule
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class, DataModule::class))
interface ApplicationComponent : DataComponent {

    fun exposeResources(): Resources

    fun exposeApplication(): Application

    override fun exposeRealmManager(): RealmManager

}