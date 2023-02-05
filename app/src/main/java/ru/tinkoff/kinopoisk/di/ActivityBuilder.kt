package ru.tinkoff.kinopoisk.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.tinkoff.kinopoisk.MainActivity

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [FragmentBuilder::class])
    internal abstract fun provideActivityBuilder(): MainActivity
}