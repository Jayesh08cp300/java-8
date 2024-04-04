package com.example.stream;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(20);
		list.add(4);
		list.add(76);
		list.add(21);
		list.add(3);
		list.add(80);

		list.stream()
				.filter(i -> i % 2 == 0)
				.forEach(System.out::println);

		System.out.println(list.stream()
				.filter(i -> i % 2 == 0)
				.count());

		list.stream()
				.filter(i -> i % 2 == 0)
				.distinct()
				.forEach(System.out::println);

	}
}
