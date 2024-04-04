package com.example.stream;

import java.util.stream.Stream;

public class Example3 {
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("i", "am", "jayesh", "how", "are", "you");

		stream.filter(s -> s.startsWith("a"))
				.forEach(System.out::println);

	}
}
