package com.example.lambda;

@FunctionalInterface
interface FunInterface {
	void abstractFun();

	default void defaultFun() {
		System.out.println("Default Function Called.");
	}
}

public class ExampleOne {
	public static void main(String[] args) {

		FunInterface funInterface = () -> {
			System.out.println("Abstract Function Called.");
		};

		funInterface.abstractFun();
		funInterface.defaultFun();
	}
}
