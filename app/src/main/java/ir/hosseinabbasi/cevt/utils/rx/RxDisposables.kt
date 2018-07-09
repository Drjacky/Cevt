package ir.hosseinabbasi.cevt.utils.rx

import io.reactivex.disposables.Disposable

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface RxDisposables {
    fun add(disposable: Disposable)

    fun clear()
}