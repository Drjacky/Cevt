package ir.hosseinabbasi.cevt.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import ir.hosseinabbasi.cevt.R

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
    }
}