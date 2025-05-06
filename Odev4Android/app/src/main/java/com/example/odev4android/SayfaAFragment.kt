package com.example.odev4android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4android.databinding.FragmentAnasayfaBinding
import com.example.odev4android.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {

    private lateinit var binding:FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSayfaABinding.inflate(inflater,container,false)

        binding.goToB.setOnClickListener{
            findNavController().navigate(R.id.aToBgecis)
        }

        return binding.root
    }


}