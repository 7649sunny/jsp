package example;

public class GlobalVar {
	static int i = 5;
	static void a() {
		int i = 10;
		b();
	}
	static void b() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		a();
	}

}
