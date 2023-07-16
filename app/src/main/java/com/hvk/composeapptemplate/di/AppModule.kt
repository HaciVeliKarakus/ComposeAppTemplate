package com.hvk.composeapptemplate.di

import com.hvk.composeapptemplate.screens.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::LoginViewModel)
}