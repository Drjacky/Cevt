package ir.hosseinabbasi.cevt.ui.weather

import android.app.Activity
import android.content.Context
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import com.squareup.picasso.Picasso
import ir.hosseinabbasi.cevt.BR
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

    @BindView(R.id.fragment_weather_imvIcon)
    lateinit var mImvIcon: ImageView

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
        val params = HashMap<String, String>() //TODO These logic should move to the presenter.
        params["q"] = Constants.QUERY
        params["APPID"] = Constants.APPID
        params["units"] = Constants.METRIC

        if (isNetworkConnected()) run {
            mPresenter.getWeather(params)
        }
    }

    override fun loadWeather(weather: WeatherResponse) {
        val weatherBinding =
                DataBindingUtil.setContentView<ViewDataBinding>(mContext as Activity, R.layout.fragment_weather)
        weatherBinding.setVariable(BR.WeatherResponseModel, weather)
        //mImvIcon.loadUrl(url)
    }

    companion object {
        val TAG: String = WeatherView::class.java.simpleName

        fun getInstance(): WeatherView {
            return WeatherView()
        }

        @JvmStatic
        @BindingAdapter("bind:imageUrl")
        fun ImageView.loadUrl(url: String?) {
            Picasso.get().load(url).into(this)
        }
    }
}