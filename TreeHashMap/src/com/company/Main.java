package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeMap<Integer, String> studenti = new TreeMap<Integer, String>();
        studenti.put(1630, "Vlada");
        studenti.put(1565, "Andrijana");

        Set set = studenti.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }

}
