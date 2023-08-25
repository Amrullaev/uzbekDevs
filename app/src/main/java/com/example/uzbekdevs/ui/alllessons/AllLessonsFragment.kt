package com.example.uzbekdevs.ui.alllessons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uzbekdevs.R
import com.example.uzbekdevs.databinding.FragmentAllLessonsBinding
import com.example.uzbekdevs.model.LanguageData
import com.example.uzbekdevs.model.LessonsData


class AllLessonsFragment : Fragment() {
    private var _binding: FragmentAllLessonsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAllLessonsBinding.inflate(layoutInflater)
        val lesson = arguments?.get("language") as LanguageData
        binding.languageLogo.setImageResource(lesson.imageLesson)
        binding.languageName.text = lesson.nameLesson
        binding.textView3.text = lesson.nameLesson
        return binding.root
    }


}