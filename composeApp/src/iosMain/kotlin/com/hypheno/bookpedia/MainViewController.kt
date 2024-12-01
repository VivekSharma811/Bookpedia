package com.hypheno.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.hypheno.bookpedia.app.App
import com.hypheno.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }
