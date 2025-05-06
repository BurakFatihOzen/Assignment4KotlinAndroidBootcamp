package com.example.odev4android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4android.databinding.FragmentAnasayfaBinding
import androidx.navigation.fragment.findNavController



class AnasayfaFragment : Fragment() {

    private lateinit var binding:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.goToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaSayfatoAgecis)
        }
        binding.goToX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.anaSayfatoXgecis)
        }


        return binding.root
    }

}