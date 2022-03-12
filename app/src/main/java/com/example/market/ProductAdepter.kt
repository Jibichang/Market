package com.example.market

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdepter(
    private val context: Context,
    private val productItemList: List<ProductModel>,
    private val onItemSelect: (item: ProductModel) -> Unit
) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_product, parent, false
        )
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productItemList[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            setSelection(position)
            onItemSelect(item)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setSelection(position: Int) {
        productItemList.forEachIndexed { index, _ ->
            productItemList[index].isSelected = index == position
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = productItemList.size
}