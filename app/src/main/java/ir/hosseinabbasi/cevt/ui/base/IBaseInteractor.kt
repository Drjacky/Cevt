package ir.hosseinabbasi.cevt.ui.base

import ir.hosseinabbasi.cevt.data.network.IApiService

/**
 * Created by Dr.jacky on 7/9/2018.
 */
/**
 * Lists APIs method and Helper classes that are common to all application components.
 */
interface IBaseInteractor{
    fun getApiService(): IApiService
}