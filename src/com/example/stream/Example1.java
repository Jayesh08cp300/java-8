package com.example.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		String array[] = { "i", "am", "jayesh" };

		Stream<String> stream = Arrays.stream(array);
		stream.forEach(s -> System.out.println(s));
	}
}
