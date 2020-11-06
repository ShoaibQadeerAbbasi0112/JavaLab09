package com.company;

public class Main {

    public static void main(String[] args) {

        CommisionEmployee c1= new CommisionEmployee("Usman","Umer","MN892N",40.87,950);
BasePlusCommisionEmployee b1=new BasePlusCommisionEmployee(2000,"Ali","Naeem","BMN9019",90.87,450);
        System.out.println(c1.toString());
        System.out.println(b1.toString());




    }
}
