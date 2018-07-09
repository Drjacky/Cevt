package ir.hosseinabbasi.cevt.ui.base

import android.support.annotation.StringRes

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface IBaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(@StringRes resId: Int)
    fun onError(message: String?)
    fun isNetworkConnected(): Boolean
}