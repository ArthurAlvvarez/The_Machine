package main;

public class CPU {
	private operandStack o;
	private Memory m;
	private boolean pause;
	private int pos;

	public CPU() {
		this.pause = false;
		this.m = new Memory();
		this.o = new operandStack();
		this.pos = 0;
	}

	public boolean isHalt() {
		if (pause) {
			return this.pause = true;
		} else {
			return this.pause = false;
		}
	}

	public void erase() {
		m.erase();
		o.erase();
	}

	public int sumaPila() {
		int resultado = 0;
		int cont = 0;
		int[] a = new int[2];
		if (cont < 2 && o.getCima() != -1) {
			a[cont] = o.pop();
			cont++;
		} else if (cont == 2) {
			resultado = a[0] - a[1];
			m.write(this.pos, resultado);
		}else {
			resultado = -1;
		}
		return resultado;
	}

	public int restaPila() {
		int resultado = 0;
		int cont = 0;
		int[] a = new int[2];
		if (o.getCima() != -1 && cont < 2) {
			a[cont] = o.pop();
			cont++;
		} else
			return resultado = -1;
		resultado = a[0] - a[1];
		if (resultado != 1) {
			m.write(this.pos, resultado);
			this.pos++;
		}
		return resultado;
	}

	/*
	 * public boolean execute(ByteCode bc) { if(bc.getBC() == ENUM_BYTECODE.ADD &&
	 * this.sumaPila() != -1) return true; if(bc.getBC() == ENUM_BYTECODE.SUB &&
	 * this.restaPila() != -1) return true; }
	 */

}
