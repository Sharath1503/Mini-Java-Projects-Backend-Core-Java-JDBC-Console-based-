package com.vector.ex;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Sharath");
		map.put(102, "lavan");
		map.put(103, "Somu");
		map.put(104, "Shiva");
		map.replace(102, "Venkat");
		System.out.println(map);
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
        Map<Integer, String> map1 = new TreeMap<Integer, String>();
		
		map1.put(103, "Sharath");
		map1.put(105, "lavan");
		map1.put(104, "Somu");
		map1.put(101, "Shiva");
		map1.put(102, "Venkat");
		System.out.println(map1);
		for(Map.Entry<Integer, String> m : map1.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		Set<String> set = new HashSet<String>();
		set.add("Sharath");
		set.add("lavan");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(String s: set)
		{
			System.out.println(s);
		}
		
		
		

	}

}
