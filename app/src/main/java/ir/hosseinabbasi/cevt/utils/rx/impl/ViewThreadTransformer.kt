package ir.hosseinabbasi.cevt.utils.rx.impl

import io.reactivex.ObservableTransformer
import io.reactivex.Scheduler
import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer
import ir.hosseinabbasi.cevt.utils.rx.qualifier.IOThreadPref
import ir.hosseinabbasi.cevt.utils.rx.qualifier.UIThreadPref
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class ViewThreadTransformer @Inject
constructor(@param:IOThreadPref private val subscribeOnScheduler: Scheduler,
            @param:UIThreadPref private val observeOnScheduler: Scheduler) : ThreadTransformer {

    override fun <T> applySchedulers(): ObservableTransformer<T, T> {
        return ObservableTransformer { observable -> observable.subscribeOn(subscribeOnScheduler).observeOn(observeOnScheduler) }
    }
}