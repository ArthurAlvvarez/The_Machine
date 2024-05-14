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
	
	public boolean execute(Engine engine) {
		if (this.command == ENUM_COMMAND.HELP) {
			engine.help();
			return true;
		}else if (this.command == ENUM_COMMAND.QUIT) {
			engine.quit();
			return true;
		}else if (this.command == ENUM_COMMAND.RUN) {
			engine.run();
			return true;
		}else if (this.command == ENUM_COMMAND.NEWINST) {
			engine.newinst(this.instruction);
			return true;
		}else if (this.command == ENUM_COMMAND.RESET) {
			engine.reset();
			return true;
		}else if (this.command == ENUM_COMMAND.REPLACE) {
			engine.replace(this.replace);
			return true;
		}else {
			System.out.println("Comando inválido en engine. Introduce help para saber los comandos disponibles");
			return false;
		}
	}
}
