package Interview;

public class Problem3 {
	public static void main(String[] args) {
		int x = 3;
		if (x % 2 == 0) {
			x--;
		}
		int c = 1;
		for (int i=1; i <= x; i++) {
			System.out.println(c);
			c = c + 2;
		}
	}
}
