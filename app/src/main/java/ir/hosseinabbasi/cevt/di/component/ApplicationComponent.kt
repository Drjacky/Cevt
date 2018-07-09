package ir.hosseinabbasi.cevt.di.component

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Component
import ir.hosseinabbasi.cevt.MyApplication
import ir.hosseinabbasi.cevt.data.db.RealmManager
import ir.hosseinabbasi.cevt.data.network.IApiService
import ir.hosseinabbasi.cevt.di.module.ApplicationModule
import ir.hosseinabbasi.cevt.di.module.DataModule
import ir.hosseinabbasi.cevt.di.module.NetModule
import ir.hosseinabbasi.cevt.di.module.UtilsModule
import ir.hosseinabbasi.cevt.di.qualifier.ApplicationContext
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class, DataModule::class, NetModule::class, UtilsModule::class))
interface ApplicationComponent : DataComponent, NetComponent, UtilsComponent {

    fun inject(app: MyApplication)

    @ApplicationContext
    fun exposeContext(): Context

    fun exposeResources(): Resources

    fun exposeApplication(): Application

    override fun exposeRealmManager(): RealmManager

    override fun exposeIApiService(): IApiService

    override fun exposeThreadTransformer(): ThreadTransformer

}