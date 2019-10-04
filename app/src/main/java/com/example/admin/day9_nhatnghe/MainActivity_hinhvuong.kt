package com.example.admin.day9_nhatnghe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_hinhvuong.*

class MainActivity_hinhvuong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hinhvuong)

        btnresult2.setOnClickListener(View.OnClickListener {
            var d:hinhvuong = hinhvuong();

            d.canh = txtcanh.text.toString().toInt()
            var e:hinhvuong = hinhvuong(d.canh)

            txtresult2.text = e.xuatTT()
        })

        btnbackhv.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
