package hackerrank.java;

import java.util.*;

/**
 * @author rirfanuddin
 */
public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int count = 1;

        while(cin.hasNextLine() == true){
            if(cin.hasNext() == true){
                System.out.println(count + " " + cin.nextLine());
                count++;
            }
        }

    }
}