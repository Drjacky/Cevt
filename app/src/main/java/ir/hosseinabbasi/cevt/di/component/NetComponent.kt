package ir.hosseinabbasi.cevt.di.component

import ir.hosseinabbasi.cevt.data.network.IApiService
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
interface NetComponent {
    @Singleton
    fun exposeIApiService(): IApiService
}