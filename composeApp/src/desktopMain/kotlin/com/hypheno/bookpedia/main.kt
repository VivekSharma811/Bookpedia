package com.hypheno.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hypheno.bookpedia.app.App
import com.hypheno.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}
