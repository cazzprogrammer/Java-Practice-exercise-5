package com.stackroute.PE_5;

import java.util.Comparator;

 public class StudentSorter implements Comparator<Student> {
     @Override
     public int compare(Student o1, Student o2) {
         if(o1.age != o2.age)
         {
             return o1.age-o2.age;
         }
         else if(o1.name.compareTo(o2.name) != 0)
         {
             return o1.name.compareTo(o2.name);
         }
         else {
             return o1.id - o2.id;
         }
     }
 }
