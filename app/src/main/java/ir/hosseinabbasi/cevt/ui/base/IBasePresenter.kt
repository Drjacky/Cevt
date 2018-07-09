package ir.hosseinabbasi.cevt.ui.base

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface IBasePresenter<V : IBaseView, I : IBaseInteractor> {
    fun onAttach(baseView: V)
    fun onDetach()
    fun getView(): V?
    fun getInteractor(): I?
    fun isViewAttached(): Boolean
}