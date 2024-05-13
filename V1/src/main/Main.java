package main;

public class Main {

	public static void main(String[] args) {
		Memory memoria = new Memory();
		ByteCodeProgram b = new ByteCodeProgram();
		ByteCode bc = new ByteCode(ENUM_BYTECODE.PUSH);
		operandStack o = new operandStack();
		CPU c = new CPU();
		o.push(2);
		o.push(4);
		System.out.println(o.getCima());
		System.out.println(c.sumaPila());
	}

}
