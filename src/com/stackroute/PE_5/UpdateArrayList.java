package com.stackroute.PE_5;

import java.util.ArrayList;

public class UpdateArrayList {

    public void updateArrayList()
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        System.out.println("Original List");
        System.out.println(list);

        list.set(1,"kiwi");
        System.out.println("Updated List");
        System.out.println(list);

        list.clear();
        System.out.println("List after removing all elements");
        System.out.println(list);

    }
}
