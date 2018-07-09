package ir.hosseinabbasi.cevt.ui.base

import ir.hosseinabbasi.cevt.data.network.IApiService
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
open class BaseInteractor @Inject
constructor(private val mApiService: IApiService) : IBaseInteractor {
    override fun getApiService(): IApiService {
        return mApiService
    }
}