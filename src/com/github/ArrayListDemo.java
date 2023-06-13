package com.github;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		
		// code changes provide better printing option rather than previous method
		
		list.stream().forEach(x->System.out.println(x));
		

	}

}
