package hackerrank;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i = cin.nextInt();
		double d = cin.nextDouble();
		cin.nextLine();
		String line = cin.nextLine();
		
		System.out.println("String: "+line);
		System.out.println("Double: "+d);
		System.out.println("Int: "+i);
		
	}

}
