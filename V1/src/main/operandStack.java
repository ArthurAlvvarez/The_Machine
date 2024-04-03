package main;

import java.util.Iterator;

public class operandStack {
	private final int MAX_STACK = 200;
	private int[] Stack = new int[MAX_STACK];
	private int Elements = 0;

	public boolean isEmpty() {
		if(Elements > 0) {
			return false;
		}else
			return true;
	}

	public void push(int num) {
		if (this.Elements < this.MAX_STACK) {
			this.Stack[Elements] = num;
			this.Elements++;
		}else
			System.out.println("Has introducido el maximo de instrucciones posibles");
	}

	public int pop() {
		int temp = this.Stack[Elements];
		if(isEmpty() == false) {
			this.Elements--;
			return temp;
		}else
			return (Integer) null;
	}
	
	public int getCima() {
		if(isEmpty() == false) {
			return this.Stack[Elements];
		}else
			return (Integer) null;
	}
	
	public String toString() {
		String texto = "";
		if (isEmpty() == false) {
			for(int i = 0; i < Elements; i++) {
				texto += this.Stack[Elements] + ", ";
			}
			return texto;
		}else
			return "No has introducido ninguna instruccion";
	}
}
