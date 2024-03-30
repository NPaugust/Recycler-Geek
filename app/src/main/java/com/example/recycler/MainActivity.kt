package com.example.recycler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.adapter.MyAdapter
import com.example.recycler.ui.theme.RecyclerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val dataset = mutableListOf<String>()
        for (i in 1..1) {
            dataset.add("Mercedes")
            dataset.add("Toyota Camry")
            dataset.add("Mustand")
            dataset.add("Porche")
            dataset.add("BMW")
            dataset.add("Kia")
            dataset.add("Tesla")




        }

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = MyAdapter(dataset)
        recyclerView.adapter = adapter



    }
}