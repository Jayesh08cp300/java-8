package com.example.stream;

import java.util.Arrays;

public class Example5 {
	public static void main(String[] args) {
		Arrays.asList(68, 45, 99, 21, 8, 76, 34, 19, 21)
				.stream()
				.sorted()
				.distinct()
				.map(e -> e + e)
				.forEach(System.out::println);
	}
}
