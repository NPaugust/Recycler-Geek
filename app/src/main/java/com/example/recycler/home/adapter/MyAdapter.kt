package com.example.recycler.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.home.CarFragment
import com.example.recycler.R
import com.example.recycler.home.model.Cars


class MyAdapter(
    private val data: List<Cars>,
    private val listener: CarFragment,
):RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        val carName: TextView = view.findViewById(R.id.car_name) as TextView
        val itemCar: LinearLayout = view.findViewById(R.id.item_car) as LinearLayout
        val carImage: ImageView = view.findViewById(R.id.car_image) as ImageView
        val carYear: TextView = view.findViewById(R.id.car_year) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.car_card_view, parent, false)

        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        Glide.with(holder.carImage).load(R.drawable.caricon).into(holder.carImage)
        holder.carName.text = item.name
        holder.carYear.text = item.year
        holder.itemCar.setOnClickListener {
            listener.clickListener(item)
        }
    }

    override fun getItemCount() = data.size
}






















//class MyAdapter(private val dataset: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
//
//    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val textView: TextView = view.findViewById(R.id.activity_item_textView)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
//        val view =  LayoutInflater.from(parent.context)
//            .inflate(R.layout.activity_item_layout, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
//        holder.textView.text = dataset[position]
//
//    }
//
//    override fun getItemCount(): Int = dataset.size
//
//
//
//}
