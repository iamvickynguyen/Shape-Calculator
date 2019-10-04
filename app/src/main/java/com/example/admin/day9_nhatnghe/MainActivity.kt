package com.example.admin.day9_nhatnghe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnhcn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity_hinhchunhat::class.java)
            startActivity(intent)
        })

        btnhv.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity_hinhvuong::class.java)
            startActivity(intent)
        })

        btnhtg.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity_hinhtamgiac::class.java)
            startActivity(intent)
        })

    }
}
