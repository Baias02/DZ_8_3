package com.example.dz_8_3f

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.dz_8_3f.databinding.FragmentSecondBinding
import com.example.dz_8_3f.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.threeButton.setOnClickListener {
            if (!binding.threeStudy.text.toString().isEmpty() && !binding.threeWork.text.toString().isEmpty()){
                navigation()
            }else{
                Toast.makeText(activity, "Введите ваше имя и фамилию", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigation(){
        val study = binding.threeStudy.text.toString()
        val work = binding.threeWork.text.toString()
        val bundle = this.arguments
        bundle?.putString("study",study)
        bundle?.putString("work",work)
        findNavController().navigate(R.id.action_thirdFragment_to_finishFragment, bundle)
    }
}