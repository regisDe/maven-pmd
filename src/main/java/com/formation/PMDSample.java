package com.formation;

public class PMDSample {
	public static void main(String args[]) {
		PMDSample.CALL_METHOD("hello");
		PMDSample.CallHello();
	}

	public static void CALL_METHOD(String INPUT_PARAMETER) {
		System.out.println(INPUT_PARAMETER);
	}

	public static void CallHello() {
		System.out.println("Hello PMD World!");
	}
	
	public static void CODE_MORT() {
		if (true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("Faux, impossible!");
		}
	}
}
