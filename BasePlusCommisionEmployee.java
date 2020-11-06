package com.company;

public class BasePlusCommisionEmployee extends  CommisionEmployee {
    int sal;

    BasePlusCommisionEmployee(){
        super();
    }
    BasePlusCommisionEmployee(int sl,String f_n, String l_n, String ss, Double comrat,int gs){
        super(f_n, l_n, ss, comrat,gs);
        sal=sl;
    }

    public double earning(){
        double temp=sal+super.earning();
        return temp;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sl) {
        this.sal = sl;
    }

    public void display(){
        super.display();
        System.out.println("Employee Salary: $"+getSal());
    }

    @Override
    public String toString() {
        return super.toString()+" "+sal;
    }
}
