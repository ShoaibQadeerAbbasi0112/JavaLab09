package com.company;

public class EmployeeTotalreport extends BasePlusCommisionEmployee {
    int emp_hours;
    EmployeeTotalreport(){
        super();
    }

    EmployeeTotalreport(int emp,int sl,String f_n, String l_n, String ss, Double comrat,int gs){
        super( sl, f_n,  l_n,  ss,  comrat,gs);
        emp_hours=emp;

    }

    public void display(){
        System.out.println("Employee Name "+getFirst_name()+" "+getLast_name());
        System.out.println("Employee SSN: "+getSsn());
        System.out.println("Employee C_R: "+getCommissionrate());
        System.out.println("Employee Salary: $"+getSal());
        System.out.println("Employee Total Working Hours: "+emp_hours);
    }
}
