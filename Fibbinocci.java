package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		System.out.println(a+ " "+b);
		for (int i = 2; i < 11; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
