package com.company;

public class Computer {
    int wordsize;
    int memorysize;
    int storage;
    int speed;


    public Computer(){}

    public Computer(int wd,int mem,int stor,int spe){
        wordsize=wd;
        memorysize=mem;
        storage=stor;
        speed=spe;
    }

    public int getMemorysize() {
        return memorysize;
    }

    public int getStorage() {
        return storage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWordsize() {
        return wordsize;
    }
}
