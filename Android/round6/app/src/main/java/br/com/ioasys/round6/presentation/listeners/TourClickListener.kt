package br.com.ioasys.round6.presentation.listeners

import br.com.ioasys.round6.domain.model.Tour

interface TourClickListener {

    fun onTourClickListener(tour: Tour)
}