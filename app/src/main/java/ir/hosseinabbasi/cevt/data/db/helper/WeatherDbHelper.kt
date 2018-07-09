package ir.hosseinabbasi.cevt.data.db.helper

import ir.hosseinabbasi.cevt.data.db.RealmManager
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
/**
 * Created to just to show how to work with DbHelper and prevent the project from Anti-Pattern;
 * (Inject Helper classes only to classes that need it)
 */
class WeatherDbHelper @Inject
constructor(private val mRealmManager: RealmManager)