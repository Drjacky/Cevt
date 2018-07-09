package ir.hosseinabbasi.cevt.di.component

import android.app.Application
import android.content.res.Resources
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
@Component()
interface ApplicationComponent {

    fun exposeResources(): Resources

    fun exposeApplication(): Application

}