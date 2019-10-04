package com.example.admin.day9_nhatnghe;

import java.text.DecimalFormat;

/**
 * Created by Admin on 4/6/2018.
 */

public class hinhchunhat {
    private int dai;
    private int rong;

    hinhchunhat()
    {
        dai = 1;
        rong = 1;
    }

    hinhchunhat(int dai, int rong)
    {
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }

    public int tinhCV()
    {
        return (dai+rong)*2;
    }

    public int tinhDT()
    {
        return dai*rong;
    }

    public String tinhDuongCheo()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(Math.sqrt(dai*dai + rong*rong));
    }

    public String xuatTT()
    {
        return "Perimeter: " + tinhCV() + '\n' + "Area: " + tinhDT() + '\n' + "Diagonal: " + tinhDuongCheo();
    }
}
