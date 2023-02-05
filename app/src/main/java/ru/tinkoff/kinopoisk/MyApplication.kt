package ru.tinkoff.kinopoisk

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.tinkoff.kinopoisk.di.DaggerAppComponent

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MyApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}