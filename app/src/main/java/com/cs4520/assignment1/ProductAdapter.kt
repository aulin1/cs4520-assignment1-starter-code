package com.cs4520.assignment1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(val itemList : List<Product>) :
    RecyclerView.Adapter<ProductViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(itemList[position])
    }
    override fun getItemCount(): Int {
        return productsDataset.size
    }
}