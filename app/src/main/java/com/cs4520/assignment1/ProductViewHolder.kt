package com.cs4520.assignment1

import android.R.attr.name
import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private val name_text: TextView = itemView.findViewById(R.id.item_name)
    private val image : ImageView = itemView.findViewById(R.id.display_image)
    private val exp_date: TextView = itemView.findViewById(R.id.item_exp_date)
    private val item_price : TextView = itemView.findViewById(R.id.item_price)
    fun bind(item: Product){
        when(item){
            is Product.FoodProduct -> {
                name_text.text = item.name
                if(item.expiry == "null"){
                    exp_date.visibility = View.INVISIBLE
                } else {
                    exp_date.text = item.expiry
                }
                val pricetext = "$" + item.price
                item_price.text = pricetext
                image.setImageResource(R.drawable.foodphoto)
                itemView.setBackgroundColor(Color.parseColor("#FFD965"))
            }
            is Product.EquipmentProduct -> {
                name_text.text = item.name
                if(item.expiry == "null"){
                    exp_date.visibility = View.INVISIBLE
                } else {
                    exp_date.text = item.expiry
                }
                val pricetext = "$" + item.price
                item_price.text = pricetext
                image.setImageResource(R.drawable.equipmentphoto)
                itemView.setBackgroundColor(Color.parseColor("#E06666"))
            }
        }
    }
}