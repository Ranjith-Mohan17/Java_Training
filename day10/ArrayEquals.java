package com.celcom.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayEquals {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		System.out.println("Enter the size of the List1 : ");
		int size1 = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		System.out.println("Enter the Elements to the List1 : ");
		for (int i = 0; i < size1; i++) {
			int k = sc.nextInt();
			l.add(k);
			map.put(k, map.getOrDefault(k, 0) + 1);
		}
		System.out.println("Enter the size of the List2 : ");
		int size2 = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		System.out.println("Enter the Elements to the List2 : ");
		for (int i = 0; i < size2; i++) {
			int k = sc.nextInt();
			l1.add(k);
			map1.put(k, map1.getOrDefault(k, 0) + 1);
		}
		if (size1 != size2) {
			System.out.println("Not Equals");
			System.exit(0);
		} else {
			for (Map.Entry<Integer, Integer> e : map.entrySet()) {
				if (map.get(e.getKey()) == map1.get(e.getKey()))
					continue;
				else {
					System.out.println("Not Equals");
					System.exit(0);
				}
			}
			for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
				if (map.get(e.getKey()) == map1.get(e.getKey()))
					continue;
				else {
					System.out.println("Not Equals");
					System.exit(0);
				}
			}
		}
		System.out.println("Equals");
		sc.close();
	}
}
