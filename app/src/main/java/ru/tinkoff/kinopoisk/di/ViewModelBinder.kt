package ru.tinkoff.kinopoisk.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.tinkoff.kinopoisk.popular.FilmListViewModel

@Module
abstract class ViewModelBinder {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FilmListViewModel::class)
    internal abstract fun filmListViewModel(viewModel: FilmListViewModel): ViewModel
}