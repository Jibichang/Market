package com.example.market

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemListView.apply {
            adapter = ProductAdepter(
                this@MainActivity,
                listOf(ProductModel("Fish"), ProductModel("Fish2"))
            ) {
                // TODO
            }
        }
    }
}



