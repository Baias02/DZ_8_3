package com.example.dz_8_3f

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.dz_8_3f.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.secondButton.setOnClickListener {
            if (!binding.secondAge.text.toString().isEmpty() && !binding.secondFloor.text.toString().isEmpty()){
                navigation()
            }else{
                Toast.makeText(activity, "Введите ваше имя и фамилию", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigation(){
        val age = binding.secondAge.text.toString()
        val floor = binding.secondFloor.text.toString()
        val bundle = this.arguments
        bundle?.putString("age",age)
        bundle?.putString("floor",floor)
        findNavController().navigate(R.id.action_secondFragment_to_thirdFragment, bundle)
    }
}