package hackerrank;

import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		cin.close();
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", x, i, (i*x));
		}

	}

}
