package com.example.admin.day9_nhatnghe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_hinhtamgiac.*
import java.text.DecimalFormat

class MainActivity_hinhtamgiac : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hinhtamgiac)

        btnresult3.setOnClickListener(View.OnClickListener {
            var a:hinhtamgiac = hinhtamgiac()
            var b:hinhtamgiac = hinhtamgiac()
            var c:hinhtamgiac = hinhtamgiac()

            a.canh1 = txtcanh1.text.toString().toInt()
            b.canh2 = txtcanh2.text.toString().toInt()
            c.canh3 = txtcanh3.text.toString().toInt()

            if (
            (Math.abs(c.canh3 - b.canh2) < a.canh1 ) &&(a.canh1 < (c.canh3+b.canh2)) &&
                    (Math.abs(c.canh3 - a.canh1) < b.canh2 ) &&(b.canh2 < (c.canh3+a.canh1)) &&
                    (Math.abs(a.canh1 - b.canh2) < c.canh3 ) &&(c.canh3 < (a.canh1+b.canh2)))
            {
                var d:hinhtamgiac = hinhtamgiac(a.canh1,b.canh2,c.canh3)

                var cheo1 = (d.tinhdt()*2)/a.canh1
                var cheo2 = (d.tinhdt()*2)/b.canh2
                var cheo3 = (d.tinhdt()*2)/c.canh3

                val df = DecimalFormat("#.00")
                txtresult3.text = d.xuatthongtin() + '\n' + "Height 1: " + df.format(cheo1) + '\n'+ "Height 2: " + df.format(cheo2) + '\n'+ "Height 3: " + df.format(cheo3) + '\n'
            }
            else
                    txtresult3.text = "WRONG INPUT !"


        })


        btnbackhtg.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
