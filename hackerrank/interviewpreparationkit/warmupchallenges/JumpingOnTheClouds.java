package hackerrank.interviewpreparationkit.warmupchallenges;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author rirfanuddin
 */
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] arrays){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        int jump=0;
        short consecutive = 0;

        for(int i=0; i<arrays.length; i++){
            if(arrays[i]==0) set.add(i);
        }

        Integer[] toIntegerArray = set.toArray(new Integer[set.size()]);


        for(int i=1; i<toIntegerArray.length; i++){
            int j = toIntegerArray[i].intValue();

            if(j-(toIntegerArray[i-1].intValue())==1){
                jump++;
                consecutive++;
                if(consecutive==2){
                    consecutive=0;
                    jump--;
                }
            } else {
                jump++;
                consecutive=0;
            }
        }

        return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(arr);

        System.out.println(result);

    }
}
