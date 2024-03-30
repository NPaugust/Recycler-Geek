package com.example.recycler

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import com.example.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

    }
}



//        val dataset = mutableListOf<String>()
//        for (i in 1..1) {
//            dataset.add("Mercedes")
//            dataset.add("Toyota Camry")
//            dataset.add("Mustand")
//            dataset.add("Porche")
//            dataset.add("BMW")
//            dataset.add("Kia")
//            dataset.add("Tesla")






//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        val layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//
//        val adapter = MyAdapter(dataset)
//        recyclerView.adapter = adapter




