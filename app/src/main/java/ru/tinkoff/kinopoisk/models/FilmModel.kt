package ru.tinkoff.kinopoisk.models

data class FilmModel(
    val id: Long,
    val title: String,
    val genre: String,
    val filmImage: String
)