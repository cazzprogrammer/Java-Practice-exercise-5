package com.stackroute.PE_5;

import java.util.ArrayList;
import java.util.Collections;

public class Manifest {

    public static void main(String args[])
    {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student(2,32,"Soumen"));
        list.add(new Student(1,32,"Soumen"));
        list.add(new Student(4,32,"Soumen"));
        list.add(new Student(2,22,"Dipankar"));
        list.add(new Student(2,32,"Aman"));

        Collections.sort(list,new StudentSorter());
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i).toString());
        }

    }
}
