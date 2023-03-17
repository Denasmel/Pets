package com.example.pets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kapibara=Animals(getString(R.string.name_kapibara),getString(R.string.discription_kapibara),R.drawable.kapibara1)
        val leleka=Animals(getString(R.string.name_leleka),getString(R.string.discription_leleka),R.drawable.leleka)
        val kin=Animals(getString(R.string.name_kin),getString(R.string.discription_kin),R.drawable.kin)

        binding.buttonKapibara.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, kapibara)
            startActivity(i)
        }

        binding.buttonLeleka.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, leleka)
            startActivity(i)
        }

        binding.buttonKin.setOnClickListener{val i= Intent(this,Discription_Activity::class.java)
            i.putExtra(ANIMAL, kin)
            startActivity(i)
        }

    }

companion object{const val ANIMAL= "key_Animal"}

}