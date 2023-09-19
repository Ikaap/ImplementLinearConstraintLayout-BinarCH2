package com.ikapurwanti.per2_binarch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikapurwanti.per2_binarch2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // private var tvHelloWorld : TextView? = null

    // 1. Declare binding (wajib) and initiate as lazy
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        // 2. change layout name into binding root
        setContentView(binding?.root)
        setTextHello()
    }

    private fun setTextHello() {
        // old way
        // tvHelloWorld = findViewById(R.id.tv_hello_world)
        // tvHelloWorld?.text = "text text text" //Setter
        // Toast.makeText(this, tvHelloWorld?.text, Toast.LENGTH_SHORT).show() // getter

        // view binding
        binding?.tvHelloWorld?.text = "text text text"

        // context in adndroid
        // Application context -> whole app context
        // Activity context -> Di activity mana
    }
}