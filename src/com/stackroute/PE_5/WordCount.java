package com.stackroute.PE_5;

import java.util.*;

public class WordCount {

    public void wordCountInSentence(String input)
    {

        String words[] = input.split("[\\s,._*?@;-]+");
        System.out.println(Arrays.toString(words));
        Set<String> list = new HashSet<>();
        ArrayList<String> list1 = new ArrayList<>();
        for(String i:words)
        {
            list.add(i);
            list1.add(i);
        }
        System.out.println(list);
        Map<String,Integer> map = new HashMap<>();
        Iterator<String> i = list.iterator();

       //Iterator<String> i = list1.iterator();
       while (i.hasNext())
       {
          String s = i.next();
          int n = Collections.frequency(list1,s);
          map.put(s,n);
       }
        System.out.println(map);
    }
}

