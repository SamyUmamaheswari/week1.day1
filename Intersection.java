package week1.day3;

public class Intersection {

	public static void main(String[] args) {
		
	
	int[] a = {3,2,11,4,6,7};
	int[] b = {1,2,8,4,9,7};
int st = a.length;
int st2 = b.length;
int count = 0;

	for (int i = 0; i < st; i++) {
	
		
		for (int j = 0; j < st2; j++) {
			
			if (a[i]==b[j]) {
				System.out.println(a[i]);
				count++;
			}
		}
	}
}
}