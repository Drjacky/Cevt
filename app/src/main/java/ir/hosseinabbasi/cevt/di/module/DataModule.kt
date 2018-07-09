package ir.hosseinabbasi.cevt.di.module

import dagger.Module
import dagger.Provides
import ir.hosseinabbasi.cevt.data.db.RealmManager
import javax.inject.Singleton

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@Module
class DataModule {

    @Provides
    @Singleton
    fun provideRealmManager(): RealmManager {
        return RealmManager()
    }
}