package com.example.uzbekdevs.ui.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uzbekdevs.databinding.ItemLanguageBinding
import com.example.uzbekdevs.model.LanguageData

class LanguageAdapter(private var list: List<LanguageData>, private val listener: OnClickListener) :
    RecyclerView.Adapter<LanguageAdapter.VH>() {

    inner class VH(private val itemLessonsBinding: ItemLanguageBinding) :
        RecyclerView.ViewHolder(itemLessonsBinding.root) {
        fun onBind(languageData: LanguageData) {
            itemLessonsBinding.languageLogo.setImageResource(languageData.imageLesson)
            itemLessonsBinding.languageName.text = languageData.nameLesson
            itemLessonsBinding.languageLessons.text = languageData.titleLesson
            itemLessonsBinding.root.setOnClickListener {
                listener.onClick(languageData)
            }
        }
    }

//    @SuppressLint("NotifyDataSetChanged")
//    fun setFilteredList(list: List<LanguageData>) {
//        this.list = list
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemLanguageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    interface OnClickListener {
        fun onClick(languageData: LanguageData)
    }
}