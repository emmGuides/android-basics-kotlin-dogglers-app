package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource


class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val dogImage: ImageView = view!!.findViewById(R.id.dogImage)
        var dogAge: TextView = view!!.findViewById(R.id.dogAge)
        val dogName: TextView = view!!.findViewById(R.id.dogName)
        val dogHobby: TextView = view!!.findViewById(R.id.dogHobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val returnVal = when(layout){
            Layout.GRID -> {
                LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            }
            else -> {
                LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
        }
        return DogCardViewHolder(returnVal)
    }

    override fun getItemCount(): Int = DataSource.dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val resources = context?.resources
        holder.dogImage.setImageResource(DataSource.dogs[position].imageResourceId)
        holder.dogAge.text = resources?.getString(R.string.dog_age, DataSource.dogs[position].age)
        holder.dogHobby.text = resources?.getString(R.string.dog_hobbies, DataSource.dogs[position].hobbies)
        holder.dogName.text = DataSource.dogs[position].name
    }
}
