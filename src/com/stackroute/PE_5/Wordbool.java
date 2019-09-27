package com.stackroute.PE_5;

import java.util.*;

public class Wordbool {

    public void wordBoolFrequency(String input[])
    {
        Set<String> list = new HashSet<>();
        ArrayList<String> list1 = new ArrayList<>();
        for(String i:input)
        {
            list.add(i);
            list1.add(i);
        }
        Map<String,Boolean> map = new HashMap<>();
        Iterator<String> i = list.iterator();
        while(i.hasNext())
        {
            String s = i.next();
            int n = Collections.frequency(list1,s);
            if(n>=2)
            {
                map.put(s,true);
            }
            else
            {
                map.put(s,false);
            }
        }
        System.out.println(map);

    }
}
