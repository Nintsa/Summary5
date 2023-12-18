package com.example.summary5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summary5.databinding.CoursesRecyclerBinding

class FullPageRecyclerAdapter (private val courses: MutableList<coursesClass>) : RecyclerView.Adapter<FullPageRecyclerAdapter.coursesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): FullPageRecyclerAdapter.coursesViewHolder {
        return coursesViewHolder(
            CoursesRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            //gavafren, verafers ver vixseneb, es mainc vicodi ase tu ise
            //xmlebs mainc mivxedav
        )
    }

    override fun onBindViewHolder(
        holder: FullPageRecyclerAdapter.coursesViewHolder, position: Int
    ) {
    }

    override fun getItemCount(): Int {
        return courses.size
    }

    inner class coursesViewHolder(private val binding: CoursesRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root)
}