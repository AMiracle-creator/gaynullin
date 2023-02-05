package ru.tinkoff.kinopoisk.filmDetails

import android.os.Bundle
import android.view.*
import moxy.MvpAppCompatFragment
import ru.tinkoff.kinopoisk.databinding.FragmentFillmDetailsBinding


class FilmFragment : MvpAppCompatFragment() {

    private var _viewBinding: FragmentFillmDetailsBinding? = null
    val viewBinding get() = _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentFillmDetailsBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}