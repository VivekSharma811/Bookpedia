package com.hypheno.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform