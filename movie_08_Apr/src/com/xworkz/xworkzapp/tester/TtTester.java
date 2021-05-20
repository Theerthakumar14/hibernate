package com.xworkz.xworkzapp.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TtTester {
	public static void main(String[] args) {
		String s = "theerthakumar";
		//System.out.println(s.length());
		int initialCount = 1;

		char[] letter = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	
		for (int i = 0; i < letter.length; i++) {
			if (!map.isEmpty() && map.containsKey(letter[i])) {
				int value = map.get(letter[i]);
				value++;
				map.put(letter[i], value);

			} else {
				map.put(letter[i], initialCount);
			}

		}
		int value = map.get('a');
		System.out.println(value);
		
		Set<Entry<Character, Integer>> word = map.entrySet();
		for (Entry<Character, Integer> entry : word) {
			System.out.println(entry.getKey() + " " +entry.getValue());
			
		}

	}

}
