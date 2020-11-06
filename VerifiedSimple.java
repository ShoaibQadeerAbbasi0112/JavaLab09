package com.company;

public class VerifiedSimple extends Simple {

    VerifiedSimple(){
        super();
    }

    VerifiedSimple(int a, int b){
        super(a,b);
    }

    @Override
    public void add() {
       if (n1>0 && n2>0){
           super.add();
       }
    }



}
