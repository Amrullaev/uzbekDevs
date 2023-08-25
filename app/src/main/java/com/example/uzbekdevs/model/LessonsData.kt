package com.example.uzbekdevs.model

import java.io.Serializable

data class LessonsData(
    val imageLanguage: Int,
    val nameLesson: String,
    val nameLanguage: String
) : Serializable
