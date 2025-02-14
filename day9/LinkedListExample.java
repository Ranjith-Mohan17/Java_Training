package com.celcom.day9;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(60);
		System.out.println(list);
		list.add(1,9);
		System.out.println(list);
		list.set(1, 10);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove(Integer.valueOf(10));
		System.out.println(list);
		System.out.println("Size : " + list.size());
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
