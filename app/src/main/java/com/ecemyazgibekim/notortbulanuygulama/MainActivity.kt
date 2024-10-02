package com.ecemyazgibekim.notortbulanuygulama

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ecemyazgibekim.notortbulanuygulama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener{

            if(binding.editTextNumber1.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()){
                var sinav1= binding.editTextNumber1.text.toString().toInt()
                var sinav2= binding.editTextNumber2.text.toString().toInt()
                var ortalama:Double=(sinav1+sinav2)/2.toDouble()
                if(ortalama>=50)
                {
                    binding.sonucText.text=ortalama.toString()+""+"Geçtiniz!"
                    binding.sonucText.setTextColor(getColor(R.color.green))
                }else{
                    binding.sonucText.text=ortalama.toString()+""+"Kaldınız!"
                    binding.sonucText.setTextColor(getColor(R.color.red))
                }
            }else{
                binding.sonucText.text="Lütfen sınav notlarınızı giriniz!"
                binding.sonucText.setTextColor(getColor(R.color.red))
            }

        }
    }

}