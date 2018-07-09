package ir.hosseinabbasi.cevt.data.db

import io.realm.Realm

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class RealmManager {
    private val localRealms = ThreadLocal<Realm>()

    fun openLocalInstance(): Realm {
        checkDefaultConfiguration()
        val realm = Realm.getDefaultInstance() // <-- consider adding parameter and Map<RealmConfiguration, ...>
        val localRealm = localRealms.get()
        if (localRealm == null || localRealm.isClosed) {
            localRealms.set(realm)
        }
        return realm
    }

    fun getLocalInstance(): Realm {
        val realm = localRealms.get()
        if (realm == null || realm.isClosed) {
            throw IllegalStateException(
                    "No open Realms were found on this thread.")
        }
        return realm
    }

    fun closeLocalInstance() {
        checkDefaultConfiguration()
        val realm = localRealms.get()
        if (realm == null || realm.isClosed) {
            throw IllegalStateException(
                    "Cannot close a Realm that is not open.")
        }
        realm.close()

        if (Realm.getLocalInstanceCount(Realm.getDefaultConfiguration()!!) <= 0) {
            localRealms.set(null)
        }
    }

    private fun checkDefaultConfiguration() {
        if (Realm.getDefaultConfiguration() == null) {
            throw IllegalStateException("No default configuration is set.")
        }
    }
}