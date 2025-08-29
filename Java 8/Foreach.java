package com.java8.example;
import java.util.ArrayList;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> joiner1 = new ArrayList<String>();
		joiner1.add("Java");
		joiner1.add("is");
		joiner1.add("a");
		joiner1.add("Programming");
		joiner1.add("Language");
		joiner1.forEach(name-> System.out.print(name+" "));
	}

}
