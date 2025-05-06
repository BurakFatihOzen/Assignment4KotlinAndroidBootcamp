package com.example.odev4android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4android.databinding.FragmentAnasayfaBinding
import com.example.odev4android.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {

    private lateinit var binding:FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSayfaXBinding.inflate(inflater,container,false)

        binding.goToYfromX.setOnClickListener{
            findNavController().navigate(R.id.xToYgecis)
        }

        return binding.root
    }


}