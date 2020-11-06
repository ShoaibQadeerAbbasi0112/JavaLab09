package com.company;

public class Laptop extends Computer {
    int length;
    int width;
    int height;

    Laptop(){
         super();
    }
    Laptop(int le,int wid, int hei,int wd,int mem,int stor,int spe){
        super(wd, mem, stor, spe);
        length=le;

    }


    public void display(){
        System.out.println("Memory Size"+getMemorysize()+"Word Size: "+getWordsize());
    }
}
