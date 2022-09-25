package week1.day3;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		
		String str = "Changeme";
		char ch []  = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			char ch1;
			if (i%2==0) {
		ch1=ch[i];
		ch[i]=Character.toUpperCase(ch1);
		System.out.println(ch[i]);
			
			}
			
		}
	}
}
