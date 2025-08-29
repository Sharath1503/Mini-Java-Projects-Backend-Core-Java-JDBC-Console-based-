package com.vector.ex;
import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> set= new HashSet();
		set.add("sharath");
		set.add("lavan");
		set.add("somu");
		set.add("venkat");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
