package ir.hosseinabbasi.cevt.utils.rx

import io.reactivex.ObservableTransformer

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface ThreadTransformer {
    fun <T> applySchedulers(): ObservableTransformer<T, T>
}