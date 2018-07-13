package ir.hosseinabbasi.cevt.data.network

import ir.hosseinabbasi.cevt.BuildConfig

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class ApiEndPoint {
    companion object {
        const val ENDPOINT_CEVT = BuildConfig.BASE_URL
        const val API_KEY = BuildConfig.API_KEY
        const val IMAGE_ENDPOINT = BuildConfig.IMAGE_URL
    }
}