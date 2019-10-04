package com.example.admin.day9_nhatnghe;

import java.text.DecimalFormat;

/**
 * Created by Admin on 4/6/2018.
 */

public class hinhtamgiac {
    private int canh1;
    private int canh2;
    private int canh3;

    hinhtamgiac()
    {
        canh1 = 3;
        canh2 = 4;
        canh3 = 5;
    }
    hinhtamgiac(int canh1, int canh2, int canh3)
    {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public int tinhcv()
    {
        return (canh1+canh2+canh3);
    }
    public double tinhdt()
    {
        double k = tinhcv()/2;
        return Math.sqrt(k*(k-canh1)*(k-canh2)*(k-canh3));
    }
    public String xuatthongtin()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Perimeter: " + tinhcv() + '\n' + "Area: " + df.format(tinhdt());
    }
}
