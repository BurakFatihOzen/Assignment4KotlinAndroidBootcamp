package com.example.odev4android

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.odev4android.databinding.ActivityMainBinding
import androidx.navigation.fragment.findNavController


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding ile layout bağlanıyor  // ActivityMainBinding: activity_main.xml dosyasına karşılık gelen otomatik oluşturulmuş sınıfın adı.
        binding = ActivityMainBinding.inflate(layoutInflater) // inflate(layoutInflater): XML dosyasını alır ve görsel olarak oluşturur (inflate). Yani XML’i ekrana çevirir.
        setContentView(binding.root) // Hatalı olan satır düzeltildi

        // NavHostFragment'ı alıyoruz
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView4) as NavHostFragment


    }
}