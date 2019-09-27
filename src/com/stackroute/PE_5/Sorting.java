package com.stackroute.PE_5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

    public void sort(Set<String> set)
    {
        System.out.println("Orginal :  "+ set);
        TreeSet sortedSet = new TreeSet<String>(set);
        System.out.println("Sorted list : " + sortedSet);

    }


    public static void main(String args[])
    {
        Set<String> list = new HashSet<>();
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");

        Sorting sorting = new Sorting();
        sorting.sort(list);


    }

}

