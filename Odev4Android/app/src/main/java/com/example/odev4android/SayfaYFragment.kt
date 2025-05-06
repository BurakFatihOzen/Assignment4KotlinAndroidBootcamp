package com.example.odev4android
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.odev4android.R
import com.example.odev4android.databinding.FragmentSayfaYBinding



class SayfaYFragment : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        // Geri tuşu ile ana sayfaya yönlendirme
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Ana sayfaya yönlendir
                findNavController().popBackStack(R.id.anasayfaFragment, false)
            }
        })

        return binding.root
    }
}
