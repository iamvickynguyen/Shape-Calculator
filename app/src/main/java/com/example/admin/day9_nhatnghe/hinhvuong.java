package com.example.admin.day9_nhatnghe;

/**
 * Created by Admin on 4/6/2018.
 */

public class hinhvuong extends hinhchunhat{
    hinhvuong()
    {
        super(1,1);
    }
    hinhvuong(int x)
    {
        super(x,x);
    }
    public int getCanh()
    {
        return this.getDai();
    }
    public void setCanh(int x)
    {
        this.setDai(x);
        this.setRong(x);
    }
    public String xuatTT()
    {
        return super.xuatTT();
    }
}
