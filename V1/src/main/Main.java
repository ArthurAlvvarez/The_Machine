package main;

public class Main {

	public static void main(String[] args) {
		Memory memoria = new Memory();
		memoria.write(10, 2);
		operandStack o = new operandStack();
		System.out.println(memoria.toString());
	}

}
