package ir.hosseinabbasi.cevt.ui.weather

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import butterknife.ButterKnife
import ir.hosseinabbasi.cevt.R
import ir.hosseinabbasi.cevt.data.db.model.WeatherResponse
import ir.hosseinabbasi.cevt.di.qualifier.ActivityContext
import ir.hosseinabbasi.cevt.ui.base.BaseFragment
import ir.hosseinabbasi.cevt.utils.Constants
import java.util.*
import javax.inject.Inject

/**
 * Created by Dr.jacky on 7/13/2018.
 */
class WeatherView : BaseFragment(), IWeatherView {

    @Inject
    @field:ActivityContext
    lateinit var mContext: Context

    @Inject
    lateinit var mPresenter: IWeatherPresenter<IWeatherView, IWeatherInteractor>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_weather, container, false)
        getActivityComponent()?.inject(this)
        setUnBinder(ButterKnife.bind(this, view))
        mPresenter.onAttach(this)
        initViews()
        return view
    }

    override fun onDestroyView() {
        mPresenter.onDetach()
        super.onDestroyView()
    }

    private fun initViews() {
        getWeather()
    }

    private fun getWeather() {
        val params = HashMap<String, String>()
        params["q"] = Constants.QUERY //TODO This logic should move to the presenter.
        params["APPID"] = Constants.APPID

        if (isNetworkConnected()) run {
            mPresenter.getWeather(params)
        }
    }

    override fun loadWeather(weather: WeatherResponse) {
        Toast.makeText(context, "" + weather.name, Toast.LENGTH_LONG).show()
    }

    companion object {
        val TAG: String = WeatherView::class.java.simpleName

        fun getInstance(): WeatherView {
            return WeatherView()
        }
    }
}