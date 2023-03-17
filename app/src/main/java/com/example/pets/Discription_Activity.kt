package com.example.pets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pets.databinding.ActivityDiscriptionBinding
import com.example.pets.databinding.ActivityMainBinding

class Discription_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityDiscriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDiscriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var animals= intent.getParcelableExtra<Animals>(MainActivity.ANIMAL)

        binding.textDescription.text=animals!!.discription

        binding.imageAnimalsFaces.setImageResource(animals.image)


        title=animals?.name
    }
}