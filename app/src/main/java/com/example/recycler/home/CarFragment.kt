package com.example.recycler.home

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.recycler.R
import com.example.recycler.databinding.FragmentCarBinding
import com.example.recycler.home.data.CarClickListener
import com.example.recycler.home.adapter.MyAdapter
import com.example.recycler.home.model.Cars

class CarFragment : Fragment(), CarClickListener {

    private lateinit var binding: FragmentCarBinding

    private val data = listOf(
        Cars(
            R.drawable.caricon,
            "2023",
            "Mercedes"
        ),
        Cars(
            R.drawable.caricon,
            "2020",
            "Toyota Camry"
        ),
        Cars(
            R.drawable.caricon,
            "2019",
            "Mustang"
        ), Cars(
            R.drawable.caricon,
            "2020",
            "Porche"
        ),
        Cars(
            R.drawable.caricon,
            "2020",
            "BMW"
        ),
        Cars(
            R.drawable.caricon,
            "2021",
            "KIA"
        ),
        Cars(
            R.drawable.caricon,
            "2020",
            "Tesla"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayLatest(data)
    }

    private fun displayLatest(response: List<Cars>) {
        binding.recycler.adapter = MyAdapter (response, this)
    }

    override fun clickListener(item: Cars) {
        findNavController().navigate(R.id.FromFirstFragment_To_SecondFragment)
    }

}
