package com.example.dz_8_3f

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz_8_3f.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {

    private lateinit var binding: FragmentFinishBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFinishBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBundle()
    }

    private fun getBundle(){
        val bundle = this.arguments
        val name = bundle?.getString("name")
        val surname = bundle?.getString("surName")
        val age = bundle?.getString("age")
        val floor = bundle?.getString("floor")
        val study = bundle?.getString("study")
        val work = bundle?.getString("work")
        binding.placeName.text = name
        binding.placeSurname.text = surname
        binding.placeAge.text = age
        binding.placeFloor.text = floor
        binding.placeStudy.text = study
        binding.placeWork.text = work
    }
}