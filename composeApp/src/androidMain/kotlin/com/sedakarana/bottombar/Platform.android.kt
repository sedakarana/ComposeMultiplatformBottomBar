package com.sedakarana.bottombar

import android.os.Build


actual fun getPlatform(): String = "Android ${Build.VERSION.SDK_INT}"