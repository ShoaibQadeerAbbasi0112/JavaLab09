package com.company;

public class Truck extends Vehicle {
    private double loading_capacity;
    private int towing_capacity;

    Truck(){
        super();
        loading_capacity=0.0;
        towing_capacity=0;
    }
    Truck(String o_name,int ow_age,String man_name,int n_cyl, double lo_cap,int tow_cap){
        super(o_name,ow_age,man_name,n_cyl);
        loading_capacity=lo_cap;
        towing_capacity=tow_cap;
    }

    public double getLoading_capacity() {
        return loading_capacity;
    }

    public void setLoading_capacity(double loading_capacity) {
        this.loading_capacity = loading_capacity;
    }

    public int getTowing_capacity() {
        return towing_capacity;
    }

    public void setTowing_capacity(int towing_capacity) {
        this.towing_capacity = towing_capacity;
    }

    public void display(){
        super.display();
        System.out.println("Loading Capacity(In Tons): "+loading_capacity+"\n Towing Capacity(lb): "+towing_capacity);
    }
}
