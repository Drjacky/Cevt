package ir.hosseinabbasi.cevt.ui.main

import ir.hosseinabbasi.cevt.ui.base.BasePresenter
import ir.hosseinabbasi.cevt.utils.rx.RxDisposableFactory
import ir.hosseinabbasi.cevt.utils.rx.RxDisposables
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class MainActivityPresenter<V : IMainActivityView, I : IMainActivityInteractor> @Inject
constructor(interactor: I,
            threadTransformer: ThreadTransformer,
            rxDisposableFactory: RxDisposableFactory) : BasePresenter<V, I>(interactor, threadTransformer, rxDisposableFactory), IMainActivityPresenter<V, I> {
    private val threadTransformer: ThreadTransformer = this.mThreadTransformer
    private val disposables: RxDisposables = this.mRxDisposables
}