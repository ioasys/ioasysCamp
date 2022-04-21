package br.com.ioasys.round6.di

import br.com.ioasys.round6.presentation.viewmodels.HomeViewModel
import br.com.ioasys.round6.presentation.viewmodels.LoginViewModel
import br.com.ioasys.round6.presentation.viewmodels.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { LoginViewModel(get()) }
    viewModel { RegisterViewModel(get()) }
    viewModel { HomeViewModel(get(), get(), get()) }
}