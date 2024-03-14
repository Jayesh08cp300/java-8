package com.example.funcationInterface;

@FunctionalInterface
interface Display {
	void print();

	default void printMe() {
		System.out.println("PrintMe");
	}
}

public class GFG implements Display {
	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public void printMe() {
		Display.super.printMe();
	}

	public static void main(String[] args) {
		GFG gfg = new GFG();
		gfg.print();
		gfg.printMe();
	}
}
