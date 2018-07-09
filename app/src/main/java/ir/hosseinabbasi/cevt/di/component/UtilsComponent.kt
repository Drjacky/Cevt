package ir.hosseinabbasi.cevt.di.component

import ir.hosseinabbasi.cevt.utils.rx.ThreadTransformer

/**
 * Created by Dr.jacky on 7/9/2018.
 */
interface UtilsComponent {
    fun exposeThreadTransformer(): ThreadTransformer
}