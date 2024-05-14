package main;

public class ByteCodeParser {

	public static ByteCode parse(String s) {
		String[] a = s.split(" ");
		switch (a.length) {
		case 2:
			if (a[0].equalsIgnoreCase("push")) {
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(a[1]));
			}else if (a[0].equalsIgnoreCase("load")) {
				return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(a[1]));
			}else if (a[0].equalsIgnoreCase("store")) {
				return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(a[1]));
			}
		case 1:
			if(a[0].equalsIgnoreCase("add")) {
				return new ByteCode(ENUM_BYTECODE.ADD);
			}else if (a[0].equalsIgnoreCase("div")) {
				return new ByteCode(ENUM_BYTECODE.DIV);
			}else if (a[0].equalsIgnoreCase("mul")) {
				return new ByteCode(ENUM_BYTECODE.MUL);
			}else if (a[0].equalsIgnoreCase("sub")) {
				return new ByteCode(ENUM_BYTECODE.SUB);
			}else if(a[0].equalsIgnoreCase("out")) {
				return new ByteCode(ENUM_BYTECODE.OUT);
			}else if (a[0].equalsIgnoreCase("halt")) {
				return new ByteCode(ENUM_BYTECODE.HALT);
			}
		default:
			return null;
		}
	}

}
