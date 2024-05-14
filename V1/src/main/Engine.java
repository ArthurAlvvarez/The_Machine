package main;

import java.util.Scanner;

public class Engine {
	private ByteCodeProgram bcp;
	private CPU c; 
	private boolean end;
	Scanner sc;
	
	public Engine() {
		bcp = new ByteCodeProgram();
		c = new CPU();
		end = false;
		sc = new Scanner(System.in);
	}
	
	public void help() {
		System.out.println("HELP: que muestra informacion sobre los distintos comandos disponibles \nQuit: cierra la aplicación \nNEWINST BC: "
				+ "introduce la instruccion BC al programa actual. Si BC no esta correctamente escrito, entonces manda un error y no lleva a cabo la inserccion"
				+ "\nRUN: ejecuta el programa actual. En caso de que se produzca un error de ejecucion, avisa al usuario mediante un mensaje \n"
				+ "RESET: inicializa el programa actual eliminando todas las instrucciones almacenadas \nREPLACE N: solicita al usuario una nueva"
				+ "instruccion butecode numero N del programa");
	}
	
	public boolean quit() {
		return this.end = true;
	}
	
	public void reset() {
		System.out.println("Reset completado");
		this.bcp.reset();
	}
	
	public void run() {
		System.out.println(this.bcp.runProgram(c));
	}
	
	public void newinst(ByteCode bc) {
		this.bcp.setInstruction(bc);
		System.out.println("Programa almacenado: \n" + bcp.toString());
	}
	
	public void replace(Integer i) {
		System.out.println("Nueva instruccion: ");
		String s = sc.nextLine().toUpperCase();
		ByteCode bc = ByteCodeParser.parse(s);
		this.bcp.setInstructionPosition(bc, i);
	}
	
	public void start() {
		String entrada = "";
		while(!this.end) {
			entrada = sc.nextLine();
			Command c = CommandParser.parse(entrada);
			System.out.println("Empieza la ejecución de " + entrada.toUpperCase() + "\n");
			if(c != null) {
				if(!c.execute(this)) {
					System.out.println("Error: ejecucion del comando incorrecta");
				}
			}else {
				System.out.println("Error: comando incorrecto");
			}
		}
		System.out.println("Apagando la matrix...");
	}
}
