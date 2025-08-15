package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30daysapp2.R
import androidx.compose.ui.text.font.Font

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font

val LibertinFontRegular = FontFamily(
    Font(R.font.libertinussans_regular)
)
val LibertinFontBold = FontFamily(
    Font(R.font.libertinussans_bold)
)

val Titan = FontFamily(
    Font(R.font.titan)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = LibertinFontBold,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp
    ),
    displayMedium = TextStyle(
        fontFamily = LibertinFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = LibertinFontRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = LibertinFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

