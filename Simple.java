package com.company;

public class Simple {
    int n1;
    int n2;

    Simple(){
        n2=1;
    }

    Simple(int a,int b){
        n1=a;
        n2=b;
    }

    public void add(){
        System.out.println("Sum is"+(n1+n2));
    }

    public void sub(){
        System.out.println("Sum is"+(n1-n2));
    }

    public void mul(){
        System.out.println("Sum is"+(n1*n2));
    }

    public void div(){
        if (n2!=0){
        System.out.println("Sum is"+(n1/n2));
    }else{
            System.out.println("Invalid");
        }}
}
