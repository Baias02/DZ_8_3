package com.example.dz_8_3f

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.dz_8_3f.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.firsButton.setOnClickListener {
            if (!binding.editName.text.toString().isEmpty() && !binding.editSurname.text.toString().isEmpty()){
                navigation()
            }else{
                Toast.makeText(activity, "Введите ваше имя и фамилию", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigation(){
        val name = binding.editName.text.toString()
        val surName = binding.editSurname.text.toString()
        val bundle = Bundle()
        bundle.putString("name",name)
        bundle.putString("surName",surName)
        findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
    }
}