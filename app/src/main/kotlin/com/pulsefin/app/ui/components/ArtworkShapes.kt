package com.pulsefin.app.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import com.pulsefin.core.designsystem.theme.artworkHeroShape
import com.pulsefin.core.designsystem.theme.artworkThumbnailShape

/** Artwork corner rounding percent from Settings (0 = square, 28 = previous default). */
val LocalArtworkCornerPercent = staticCompositionLocalOf { 12 }

@Composable
fun rememberArtworkThumbnailShape(): Shape {
    val percent = LocalArtworkCornerPercent.current
    return remember(percent) { artworkThumbnailShape(percent) }
}

@Composable
fun rememberArtworkHeroShape(): Shape {
    val percent = LocalArtworkCornerPercent.current
    return remember(percent) { artworkHeroShape(percent) }
}
