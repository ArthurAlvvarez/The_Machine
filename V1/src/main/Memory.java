package main;

public class Memory {
	private int Max_memory;
	private int size = 0;
	private Integer[] memory = new Integer[size];
	private boolean empty = true;
	
	private void resize (int pos) {
		if(pos >= size) {
			this.empty = false;
			Integer[] array2 = new Integer[pos*2];
			array2 = this.memory;
		}else {
			System.out.println("No se permite posicion negativa");
		}
	}
	
	public boolean write(int pos, int x) {
		if(pos >= 0) {
			this.resize(pos);
			memory[pos] = x;
			return true;
		}else {
			return false;
		}
	}
	
	public Integer read(int pos) {
		
	}
}
