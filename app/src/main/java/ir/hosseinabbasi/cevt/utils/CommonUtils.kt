package ir.hosseinabbasi.cevt.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.format.DateFormat
import ir.hosseinabbasi.cevt.R
import ir.hosseinabbasi.cevt.data.network.ApiEndPoint
import java.util.*

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class CommonUtils {
    companion object {
        fun showLoadingDialog(context: Context): ProgressDialog {
            val progressDialog = ProgressDialog(context)
            progressDialog.show()
            if (progressDialog.window != null) {
                progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
            progressDialog.setContentView(R.layout.progress_dialog)
            progressDialog.isIndeterminate = true
            progressDialog.setCancelable(true)
            progressDialog.setCanceledOnTouchOutside(false)
            return progressDialog
        }

        @JvmStatic
        fun timestampToDate(time: Long): String {
            val cal = Calendar.getInstance(Locale.ENGLISH)
            cal.timeInMillis = time * 1000L
            return DateFormat.format("yyy-MM-dd HH:mm", cal).toString()
        }

        @JvmStatic
        fun iconIdToUrl(iconId: String): String {
            return ApiEndPoint.IMAGE_ENDPOINT + iconId + Constants.ICON_EXTENSION_APPID
        }
    }
}