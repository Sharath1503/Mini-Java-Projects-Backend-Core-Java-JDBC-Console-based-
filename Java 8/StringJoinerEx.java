package com.java8.example;

import java.util.*;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner = new StringJoiner("+","*****","*****");
		joiner.add("Java");
		joiner.add("is");
		joiner.add("a");
		joiner.add("Programming");
		joiner.add("Language");
		System.out.println(joiner);
		
	}

}
