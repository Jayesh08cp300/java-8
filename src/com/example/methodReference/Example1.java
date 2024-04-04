package com.example.methodReference;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pineapple");
		fruits.add("Apple");

		System.out.println("Elements in ArrayList are : " + fruits);

		fruits.stream()
				.forEach(s -> System.out.println("Element in ArrayList : " + s));

		fruits.stream()
				.forEach(System.out::println);

	}
}
