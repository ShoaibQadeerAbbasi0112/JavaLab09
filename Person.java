package com.company;

public class Person {
    private String name;
    private  int age;

    Person(){}

    Person(String n, int ag){
        name=n;
        age=ag;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int ag) {
        this.age = ag;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public void display(){
        System.out.println( "Name: "+name+"\n Age: "+age+" years");
    }

}
