package ir.hosseinabbasi.cevt.di.component

import dagger.Component
import ir.hosseinabbasi.cevt.di.module.ActivityModule
import ir.hosseinabbasi.cevt.di.qualifier.PerActivity

/**
 * Created by Dr.jacky on 7/9/2018.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent