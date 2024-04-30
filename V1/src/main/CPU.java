package main;

public class CPU {
	private operandStack o; 
	private Memory m; 
	private boolean pause;
	
	public CPU() {
		this.pause = false;
		this.m = new Memory();
		this.o = new operandStack();
	}
	
	public boolean execute(ByteCode bc) {
		if(bc == ENUM_BYTECODE.ADD)
			return true;
	}
}
