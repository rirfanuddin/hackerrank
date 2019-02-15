package hackerrank.practice.interviewpreparationkit.warmupchallenges;

import java.util.Scanner;

/**
 * @author rirfanuddin
 */
public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long aAInOneString=0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a') aAInOneString++;
        }

        long repeated = n/s.length();

        long result=0;

        if(n%s.length()==0){
            result = aAInOneString*repeated;
        } else {
            int sisa=0;
            for(int i=0; i<(n%s.length()); i++){
                char c = s.charAt(i);
                if(c=='a')sisa++;
            }
            result=(aAInOneString*repeated)+sisa;
        }

        System.out.println(result);

    }
}
