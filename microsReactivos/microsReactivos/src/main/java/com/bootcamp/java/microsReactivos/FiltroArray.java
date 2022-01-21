package com.bootcamp.java.microsReactivos;

import java.util.List;

public class FiltroArray {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9,8);
		
		//Programación imperativa
		
		int count = 0;
		for(int i : numbers) {
			if(i > 10) {
				 count ++;	 
			}
			
		}
		
		Long count2 = numbers.stream().filter(num -> num > 10).count();
		
		System.out.println(count);
		System.out.println(count2);
	}

}
