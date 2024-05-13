package main;

public class Command {
	
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	public Command(ENUM_COMMAND c) {
		this.command = c;
	}
	
	public Command(ENUM_COMMAND c, ByteCode bc) {
		this.command = c;
		this.instruction = bc;
	}
	
	public Command(ENUM_COMMAND c, int i) {
		this.command = c;
		this.replace = i;
	}
}
