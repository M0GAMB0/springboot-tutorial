package com.example.initial_project;

public class Student {
    private int rollNo;
    private int age;
    private String name;
    private String mobNo;

    public Student(int rollNo, int age, String name, String mobNo) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.mobNo = mobNo;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
