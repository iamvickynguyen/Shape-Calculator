package com.example.admin.day9_nhatnghe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main_hinhchunhat.*

class MainActivity_hinhchunhat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hinhchunhat)


        btnresult.setOnClickListener(View.OnClickListener {
            var a:hinhchunhat = hinhchunhat()
            var b:hinhchunhat = hinhchunhat()

            a.dai = txtdai.text.toString().toInt()
            b.rong = txtrong.text.toString().toInt()

            var c:hinhchunhat = hinhchunhat(a.dai,b.rong)


            txtresult.text = c.xuatTT()
        })

        btnbackhcn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
