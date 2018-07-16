package hackerrank;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		String result = "";
		
		if(x%2!=0) {
			result = "Weird";
		}
		else {
			if(x>1 && x<6) result = "Not Weird";
			else if(x>=6 && x<=20) result = "Weird";
			else result = "Not Weird";
		}
		
		System.out.println(result);
		
	}

}
