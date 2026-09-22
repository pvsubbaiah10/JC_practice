package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharsinString {

	public static void main(String[] args) {

		String input = "Learn Java Programming";

		// using hash map
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : input.toCharArray()) {
			if (ch == ' ')
				continue;
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		 //System.out.println(map);

		for (Map.Entry<Character, Integer> mapkv : map.entrySet()) {
			if (mapkv.getValue() > 1) {

				System.out.println(mapkv.getKey() + "-->" + mapkv.getValue());

			}
		}

		// using set print only duplicates

		Set<Character> set = new LinkedHashSet<>();
		Set<Character> duplicates = new HashSet<>();

		for (char ch : input.toCharArray()) {
			if (ch == ' ')
				continue;
			if (!set.add(ch)) {
				duplicates.add(ch);
			}

		}

		for (char cc : set) {
			System.out.print(cc + " ");
		}

		System.out.println();
		System.out.println(set);
		System.out.println(duplicates);

	}

}
