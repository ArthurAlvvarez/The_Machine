package main;

public class Memory {
	private int Max_memory;
	private int size = 5;
	private Integer[] memory = new Integer[size];
	private boolean empty;
	
	public Memory() {
		this.empty = true;
	}
	
	private void resize (int pos) {
		if(pos >= size) {
			this.empty = false;
			Integer[] array2 = new Integer[pos*2];
			for (int i = 0; i < this.memory.length; i++) {
	            array2[i] = this.memory[i];
	        }
			this.memory = array2;
		}
	}
	
	public boolean write(int pos, int x) {
		if(pos >= 0) {
			this.resize(pos);
			this.memory[pos] = x;
			return true;
		}else {
			return false;
		}
	}
	
	public Integer read(int pos) {
		if (this.memory[pos] == null) {
			return -1;
		}else {
			return this.memory[pos];
		}
	}
}
