package com.cs4520.assignment1

/*
* File that holds everything necessary for the Product and Lists
* */
sealed class Product(name: String, type: String, expiry: String?, price: Int){

    //types of products
    data class FoodProduct(val name: String, val expiry: String, val price: Int) : Product(name = name, "Food", expiry = expiry, price = price)
    data class EquipmentProduct(val name: String, val price: Int) : Product(name = name, "Equipment", expiry = null, price = price)
}

