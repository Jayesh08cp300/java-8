package com.example.lambda;

@FunctionalInterface
interface FunInterfaceTwo<T> {
	T abstractFun(T t1, T t2);

	default void defaultFun() {
		System.out.println("Default Function Called.");
	}
}

public class ExampleTwo {
	public static void main(String[] args) {

		FunInterfaceTwo<String> funInterface = (String s1, String s2) -> "Abstract Function Called.";
		System.out.println(funInterface.abstractFun("Jayesh", "Prajapati"));

		funInterface.defaultFun();
	}
}
