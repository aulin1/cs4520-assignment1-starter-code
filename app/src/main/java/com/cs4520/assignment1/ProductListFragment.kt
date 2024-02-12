package com.cs4520.assignment1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class ProductListFragment : Fragment(R.layout.product_list_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.adapter = ProductAdapter(convertList())
    }

    private fun convertList() : List<Product> {
        val itemlist = mutableListOf<Product>()
        for(p in productsDataset){
            itemlist.add(convertToProduct(p))
        }
        return itemlist
    }

    private fun convertToProduct(product : List<Any?>) : Product {
        return if(product[1] == "Food"){ //since it can only equal food or equipment
            Product.FoodProduct(product[0].toString(), product[2].toString(),
                product[3] as Int)
        } else {
            Product.EquipmentProduct(product[0].toString(),
                product[3] as Int)
        }
    }
}