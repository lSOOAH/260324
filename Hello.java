package kr.ac.bu;

public class Hello {
	
	public void print(String name) {
		System.out.println("Hello, " + name);
	}

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello.print("java");

	}

}
