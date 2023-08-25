package com.example.uzbekdevs.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.uzbekdevs.R
import com.example.uzbekdevs.databinding.FragmentHomeBinding
import com.example.uzbekdevs.model.LanguageData
import com.example.uzbekdevs.ui.home.adapter.LanguageAdapter
import java.util.Locale


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

//    private var languageList2 = ArrayList<LanguageData>()
//    private lateinit var languageAdapter: LanguageAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)


        val languageAdapter =
            LanguageAdapter(languageList(), object : LanguageAdapter.OnClickListener {
                override fun onClick(languageData: LanguageData) {
                    val bundle = Bundle()
                    bundle.putSerializable("language", languageData)
                    findNavController().navigate(R.id.allLessonsFragment, bundle)
                }

            })
        binding.rv.adapter = languageAdapter



//        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
//            androidx.appcompat.widget.SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                filterList(newText)
//                return true
//            }
//
//        })

        return binding.root
    }

    private fun languageList(): ArrayList<LanguageData> {
        val list = ArrayList<LanguageData>()

        list.add(LanguageData(R.drawable.django, "django", "Kirish"))
        list.add(LanguageData(R.drawable.cplus, "C++", "Kirish"))
        list.add(LanguageData(R.drawable.javascript, "javascript", "Kirish"))
        list.add(LanguageData(R.drawable.vue_js, "vue.js", "Kirish"))
        list.add(LanguageData(R.drawable.go, "go lang", "Kirish"))
        list.add(LanguageData(R.drawable.sql, "sql", "Kirish"))
        list.add(LanguageData(R.drawable.python, "python", "Kirish"))
        list.add(LanguageData(R.drawable.java, "java", "Kirish"))
        list.add(LanguageData(R.drawable.dart, "dart", "Kirish"))
        list.add(LanguageData(R.drawable.laravel, "laravel", "Kirish"))
        list.add(LanguageData(R.drawable.csharp, "c#", "Kirish"))
        list.add(LanguageData(R.drawable.php, "php", "Kirish"))
        list.add(LanguageData(R.drawable.git, "git", "Kirish"))
        list.add(LanguageData(R.drawable.html5, "html", "Kirish"))
        list.add(LanguageData(R.drawable.c, "c", "Kirish"))
        list.add(LanguageData(R.drawable.swift, "swift", "Kirish"))
        list.add(LanguageData(R.drawable.ruby, "ruby", "Kirish"))
        list.add(LanguageData(R.drawable.kotlin, "kotlin", "Kirish"))
        list.add(LanguageData(R.drawable.scala, "scala", "Kirish"))

        list.sortBy {
            it.nameLesson
        }

        return list
    }


//    private fun filterList(query: String?) {
//
//        if (query != null) {
//            val filteredList = ArrayList<LanguageData>()
//            for (i in languageList2) {
//                if (i.nameLesson.lowercase(Locale.ROOT).contains(query)) {
//                    filteredList.add(i)
//                }
//            }
//
//            if (filteredList.isEmpty()) {
//                Toast.makeText(requireContext(), "No Data found", Toast.LENGTH_SHORT).show()
//            } else {
//                languageAdapter.setFilteredList(filteredList)
//            }
//        }
//    }
}