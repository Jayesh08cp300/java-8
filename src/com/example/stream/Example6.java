package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example6 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Geeks", "For", "GeeksForGeeks", "A", "Computer", "Portal");

		stream.filter(s -> s.startsWith("G"))
				.peek(System.out::println)
				.map(s -> s.toUpperCase())
				.peek(System.out::println)
				.count();

		List<String> strings = Arrays.asList("Geeks", "For", "GeeksForGeeks", "A", "Computer", "Portal");
		strings.parallelStream()
				.filter(s -> s.startsWith("G"))
				.peek(System.out::println)
				.map(s -> s.toUpperCase())
				.peek(System.out::println)
				.count();
	}
}
