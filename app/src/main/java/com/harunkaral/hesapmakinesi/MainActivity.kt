package com.harunkaral.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.harunkaral.hesapmakinesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var sayi1:Double? = null
    var sayi2:Double? = null
    var sonuc:Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun topla(view:View){
        sayi1 = binding.editText.text.toString().toDoubleOrNull()
        sayi2 = binding.editText2.text.toString().toDoubleOrNull()
        sonuc = binding.textView.text.toString().toDoubleOrNull()

        if ( sayi1 != null && sayi2 != null){
            sonuc = sayi1!! + sayi2 !!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Lütfen sayıları giriniz"
        }


    }

    fun bol(view:View){
        sayi1 = binding.editText.text.toString().toDoubleOrNull()
        sayi2 = binding.editText2.text.toString().toDoubleOrNull()
        sonuc = binding.textView.text.toString().toDoubleOrNull()

        if ( sayi1 != null && sayi2 != null){
            sonuc = sayi1!! / sayi2 !!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Lütfen sayıları giriniz"
        }


    }

    fun carp(view:View){
        sayi1 = binding.editText.text.toString().toDoubleOrNull()
        sayi2 = binding.editText2.text.toString().toDoubleOrNull()
        sonuc = binding.textView.text.toString().toDoubleOrNull()

        if ( sayi1 != null && sayi2 != null){
            sonuc = sayi1!! * sayi2 !!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Lütfen sayıları giriniz"
        }


    }

    fun cikar(view:View){
        sayi1 = binding.editText.text.toString().toDoubleOrNull()
        sayi2 = binding.editText2.text.toString().toDoubleOrNull()
        sonuc = binding.textView.text.toString().toDoubleOrNull()

        if ( sayi1 != null && sayi2 != null){
            sonuc = sayi1!! - sayi2 !!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Lütfen sayıları giriniz"
        }


    }





}