package com.sedakarana.bottombar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform