package ir.hosseinabbasi.cevt.utils.rx.impl

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import ir.hosseinabbasi.cevt.utils.rx.RxDisposables
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class CompositeDisposablesImpl @Inject
constructor() : RxDisposables {

    var compositeDisposable = CompositeDisposable()

    override fun add(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun clear() {
        compositeDisposable.clear()
    }
}