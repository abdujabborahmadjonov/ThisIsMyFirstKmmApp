package dev.abdujabbor.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform