package ir.hosseinabbasi.cevt.di.component

import ir.hosseinabbasi.cevt.data.db.RealmManager
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Singleton
interface DataComponent {
    @Singleton
    fun exposeRealmManager(): RealmManager
}