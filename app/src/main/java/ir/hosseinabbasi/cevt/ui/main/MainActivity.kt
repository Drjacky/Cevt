package ir.hosseinabbasi.cevt.ui.main

import android.os.Bundle
import butterknife.ButterKnife
import ir.hosseinabbasi.cevt.R
import ir.hosseinabbasi.cevt.ui.base.BaseActivity
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/9/2018.
 */
class MainActivity : BaseActivity(), IMainActivityView {

    @Inject
    lateinit var mPresenter: IMainActivityPresenter<IMainActivityView, IMainActivityInteractor>

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
        setUnBinder(ButterKnife.bind(this))
        initViews()
        mPresenter.onAttach(this)
    }

    public override fun onDestroy() {
        mPresenter.onDetach()
        super.onDestroy()
    }

    private fun initViews() {
    }
}