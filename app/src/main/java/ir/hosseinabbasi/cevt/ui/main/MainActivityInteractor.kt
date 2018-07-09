package ir.hosseinabbasi.cevt.ui.main

import ir.hosseinabbasi.cevt.data.network.IApiService
import ir.hosseinabbasi.cevt.ui.base.BaseInteractor
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class MainActivityInteractor @Inject
constructor(apiService: IApiService) : BaseInteractor(apiService), IMainActivityInteractor