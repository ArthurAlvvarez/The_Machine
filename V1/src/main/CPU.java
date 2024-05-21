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
		return pause;
	}
	
	public boolean stopCPU() {
		return pause = true;
	}
	
	public boolean runCPU() {
		return pause = false;
	}
	
	public boolean push(int number) {
        if (o.push(number))
            return true;
        else
            return false;
    };
	
	public void erase() {
		m.erase();
		o.erase();
	}

	public boolean sumaPila() {
		if(o.isEmpty() == false && o.getElemts() > 1) {
			int num1 = o.pop();
			int num2 = o.pop();
			int resultado = num1 + num2;
			o.push(resultado);
			return true;
		}else {
			return false;
		}
	}

	public boolean restaPila() {
		if(o.isEmpty() == false && o.getElemts() > 1) {
			int num1 = o.pop();
			int num2 = o.pop();
			int resultado = num1 - num2;
			o.push(resultado);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean dividePila() {
		if(o.isEmpty() == false && o.getElemts() > 1) {
			int num1 = o.pop();
			int num2 = o.pop();
			int resultado = num1 / num2;
			o.push(resultado);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean multiplicaPila() {
		if(o.isEmpty() == false && o.getElemts() > 1) {
			int num1 = o.pop();
			int num2 = o.pop();
			int resultado = num1 * num2;
			o.push(resultado);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean store(int i) {
		if (o.getCima() != -1) {
			m.write(i, o.pop());
			return true;
		}else {
			return false;
		}
	}
	
	public boolean load(int i) {
		if (m.read(i) != -1) {
			o.push(m.read(i));
			return true;
		}else {
			return false;
		}
	}
	
	public boolean out() {
		if(o.isEmpty() == false && o.getElemts() > 0) {
			System.out.println("En la cima de la pila se encuentra: " + o.getCima());
			return true;
		}else {
			return false;
		}
	}
	
	public boolean execute(ByteCode instruction) {
        switch (instruction.getBC()) {
        case ADD:
            return sumaPila();
        case SUB:
            return restaPila();
        case DIV:
            return dividePila();
        case MUL:
            return multiplicaPila();
        case PUSH:
            return push(instruction.getParam());
        case HALT:
            return stopCPU();
        case LOAD:
            return load(instruction.getParam());
        case OUT:
            return out();
        case STORE:
            return store(instruction.getParam());
        default:
            System.out.println("Fallo: instruccion incorrecta");
            return false;
        }
    }
	
	public String toString() {
		return "Memoria: " + m.toString() + "\nPila: " + o.toString();
	}
}
