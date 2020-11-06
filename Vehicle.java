package com.company;

public class Vehicle extends Person{
    private String m_name;
    private int num_of_cy;

    Vehicle(){
        super();
        m_name="NO ";
        num_of_cy=0;
    }
    Vehicle(String ow_name,int ow_age,String man_name,int n_cyl ){
        super(ow_name,ow_age);
        m_name=man_name;
        num_of_cy=n_cyl;
    }

    public int getNum_of_cy() {
        return num_of_cy;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setNum_of_cy(int num_of_cy) {
        this.num_of_cy = num_of_cy;
    }

    public void display(){
        super.display();
        System.out.println("Manufacturer's Name: "+m_name+"\n  No of Cylinders: "+num_of_cy);
    }
}
