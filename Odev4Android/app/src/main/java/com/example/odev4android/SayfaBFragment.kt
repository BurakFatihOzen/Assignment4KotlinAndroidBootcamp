package com.example.odev4android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4android.databinding.FragmentAnasayfaBinding
import com.example.odev4android.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {

    private lateinit var binding:FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSayfaBBinding.inflate(inflater,container,false)

        binding.goToYfromB.setOnClickListener{
            findNavController().navigate(R.id.bToYgecis)
        }

        return binding.root
    }

}