package com.xworkz.xworkzapp.tester;

import java.util.HashMap;
import java.util.Map;

public class SsTester {
	public static void main(String[] args) {
		
		String s = "Xworkz is located in Bengluru Bengluru is capital city of Karnataka Bengluru is most econmic country";
		int count =1;
		String[] split = s.split(" ");
		Map<String, Integer> wordsWithCount = new HashMap<String, Integer>();
		for(int i =0; i<split.length; i++) {
			if(!wordsWithCount.isEmpty() && wordsWithCount.containsKey(split[i])) {
				int value=wordsWithCount.get(split[i]);
				value++;
				wordsWithCount.put(split[i], value);
				
			}
		else {
			wordsWithCount.put(split[i], count);
		}
		
	}
		int value =wordsWithCount.get("capital");
		System.out.println(value);

}
}
