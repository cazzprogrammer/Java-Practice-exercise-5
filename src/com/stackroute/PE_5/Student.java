package com.stackroute.PE_5;

public class Student {
    String name;
    int id;
    int age;

    public Student(int id,int age,String name)
    {
        this.age=age;
        this.id =id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+" "+age+" "+name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
