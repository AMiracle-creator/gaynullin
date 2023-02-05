package ru.tinkoff.kinopoisk.popular

import ru.tinkoff.domain.models.Film
import ru.tinkoff.kinopoisk.models.FilmModel

fun mapFilmToFilmModel(film: Film): FilmModel {
    return with(film) {
        FilmModel(id, title, genre, filmImage)
    }
}