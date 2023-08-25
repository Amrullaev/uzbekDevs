package com.example.uzbekdevs.ui.alllessons.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uzbekdevs.databinding.ItemLanguageBinding
import com.example.uzbekdevs.databinding.ItemLessonBinding
import com.example.uzbekdevs.model.LanguageData
import com.example.uzbekdevs.model.LessonsData

class AllessonAdapter(private val list: List<LessonsData>) :
    RecyclerView.Adapter<AllessonAdapter.VH>() {

    inner class VH(private val item: ItemLessonBinding) :
        RecyclerView.ViewHolder(item.root) {
        fun onBind(lessonsData: LessonsData) {
            item.languageLogo.setImageResource(lessonsData.imageLanguage)
            item.lessonName.text = lessonsData.nameLesson
            item.languageName.text = lessonsData.nameLanguage

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }
}