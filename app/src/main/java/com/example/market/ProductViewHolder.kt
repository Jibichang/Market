package com.example.market

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_product.view.*

class ProductViewHolder(private val view: View):
    RecyclerView.ViewHolder(view){

    fun bind(item: ProductModel) {
        view.productNameTextView.text = item.productName
    }
}