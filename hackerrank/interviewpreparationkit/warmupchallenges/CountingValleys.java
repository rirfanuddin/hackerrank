package hackerrank.interviewpreparationkit.warmupchallenges;

import java.util.Scanner;

/**
 * @author rirfanuddin
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s = cin.next();
        char[] c = s.toCharArray();
        int base = 0;
        int valley = 0;
        int current = base;
        boolean isValley=false;

        for(int i=0; i<c.length; i++){
            if(c[i]=='U') current++;
            else current--;

            if(current<0) isValley=true;
            else if(current>0) isValley = false;
            else if(isValley) valley++;
        }

        System.out.println(valley);

    }
}
