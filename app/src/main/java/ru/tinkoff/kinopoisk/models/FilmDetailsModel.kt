package ru.tinkoff.kinopoisk.models

data class FilmDetailsModel(
    val id: Long,
    val title: String,
    val description: String,
    val genres: List<String>,
    val countries: List<String>,
    val startYear: Int
)