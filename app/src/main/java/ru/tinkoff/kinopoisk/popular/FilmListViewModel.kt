package ru.tinkoff.kinopoisk.popular

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import ru.tinkoff.domain.usecase.FilmUseCase
import ru.tinkoff.kinopoisk.models.FilmModel
import javax.inject.Inject

class FilmListViewModel @Inject constructor(
    private val filmUseCase: FilmUseCase
) : ViewModel() {

    private val _films = MutableSharedFlow<List<FilmModel>>()
    val films = _films.asSharedFlow()

    fun loadFilms() {
        viewModelScope.launch {
            _films.emit(filmUseCase.getFilmList().map {
                mapFilmToFilmModel(it)
            })
        }
    }
}