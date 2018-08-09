package com.company;


class InvalidAge extends Exception {
    public String toString(){
        return "Invalid Age entered...";
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age,String name){
        if(age <= 0){
            try {
                throw new InvalidAge();
            } catch (InvalidAge e) {
                e.printStackTrace();
            }
        }
        else{
            this.age = age;
            this.name = name;
        }
    }
    public void show(){
        System.out.println("Age :"+age);
        System.out.println("Name :"+name);
    }
}
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(25,"SACHIN");
        p1.show();
        Person p2 = new Person(-25,"PASHA");
        p2.show();
    }
}
