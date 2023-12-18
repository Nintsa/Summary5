package com.example.summary5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.RecyclerView
import com.example.summary5.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var fullPageRecycler: RecyclerView
    private lateinit var homeRwcycler: RecyclerView
    private lateinit var binding: FragmentHomeBinding
    private val courses:MutableList<>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}