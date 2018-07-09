package ir.hosseinabbasi.cevt.ui.base

import android.os.Bundle
import ir.hosseinabbasi.cevt.utils.rx.RxDisposableFactory
import ir.hosseinabbasi.cevt.utils.rx.RxDisposables
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
open class BasePresenter<V : IBaseView, I : IBaseInteractor> @Inject
constructor(mInteractor: I,
            val mThreadTransformer: ThreadTransformer,
            mRxDisposableFactory: RxDisposableFactory) : IBasePresenter<V, I> {

    var mRxDisposables: RxDisposables = mRxDisposableFactory.get()
        private set

    var mStateBundle: Bundle? = null

    var mBaseView: V? = null
        private set

    var mBaseInteractor: I? = null
        private set

    init {
        mBaseInteractor = mInteractor
    }

    override fun onAttach(baseView: V) {
        mBaseView = baseView
    }

    override fun onDetach() {
        mRxDisposables.clear()
        mBaseView = null
        mBaseInteractor = null
    }

    override fun getView(): V? {
        return mBaseView
    }

    override fun getInteractor(): I? {
        return mBaseInteractor
    }

    override fun isViewAttached(): Boolean {
        return mBaseView != null
    }

    fun checkViewAttached() {
        if (!isViewAttached()) throw BaseViewNotAttachedException()
    }

    class BaseViewNotAttachedException : RuntimeException("Please call Presenter.onAttach(IBaseView) before" + " requesting data to the Presenter")
}