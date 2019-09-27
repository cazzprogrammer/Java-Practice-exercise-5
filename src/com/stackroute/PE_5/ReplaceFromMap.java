package com.stackroute.PE_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReplaceFromMap {
    public Map<String,String> replaceValue(Map<String,String> map)
    {
        Map<String,String> map1 = new HashMap<>();
        //String value[] = (String[]) map.values().toArray();
        Set<String> keys = map.keySet();
        Iterator<String> i = keys.iterator();
        String s=""; int l=0;

        s = i.next();
        String s1 = i.next();
            //l++;

        System.out.println(s);
         map1.put(s," ");
         map1.put(s1,map.get(s1));
        return map1;
    }

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        ReplaceFromMap replaceFromMap=new ReplaceFromMap();
        map.put("val1","levin");
        map.put("val2","kevin");
        System.out.println(replaceFromMap.replaceValue(map));
    }

}
