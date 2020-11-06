package com.company;

public class CommisionEmployee {
    String first_name;
    String last_name;
    String  ssn;
    Double commissionrate;
    int goss_sale;

    CommisionEmployee(){
    }
    CommisionEmployee(String f_n, String l_n, String ss, Double comrat, int g_s){
        first_name=f_n;
        last_name=l_n;
        ssn=ss;
        goss_sale=g_s;
        commissionrate=comrat;
    }
    public double earning(){
        double earning=goss_sale*commissionrate;
        return earning;
    }

    public Double getCommissionrate() {
        return commissionrate;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setCommissionrate(Double commissionrate) {
        this.commissionrate = commissionrate;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void display(){
        System.out.println("Employee Name "+getFirst_name()+" "+getLast_name());
        System.out.println("Employee SSN: "+getSsn());
        System.out.println("Employee C_R: "+getCommissionrate());

    }

    public String toString(){
        return first_name+" "+last_name+" "+ssn+" "+commissionrate+" "+goss_sale;
    }


}
