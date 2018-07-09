package ir.hosseinabbasi.cevt.utils.rx

import ir.hosseinabbasi.cevt.utils.rx.impl.CompositeDisposablesImpl
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class RxDisposableFactory @Inject constructor() {
    fun get(): RxDisposables {
        return CompositeDisposablesImpl()
    }
}