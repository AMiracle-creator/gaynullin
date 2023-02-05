package ru.tinkoff.kinopoisk.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.tinkoff.kinopoisk.popular.FilmListFragment

@Module
internal abstract class FragmentBuilder {

    @ContributesAndroidInjector
    abstract fun provideFilmListFragment(): FilmListFragment
}