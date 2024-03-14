package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class ExampleThree {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("d");

		list.stream().forEach(s -> {
			System.out.println(s);
		});

		list.stream().forEachOrdered(s -> {
			System.out.println(s);
		});
	}
}
