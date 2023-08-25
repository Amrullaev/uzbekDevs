package com.example.uzbekdevs.model

import java.io.Serializable

data class LanguageData(
    val imageLesson: Int,
    val nameLesson: String = "",
    val titleLesson: String = ""
):Serializable
