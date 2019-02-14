package hackerrank.practice.interviewpreparationkit.warmupchallenges;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author rirfanuddin
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = cin.nextInt();
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                sum++;
            } else {
                set.add(arr[i]);
            }
        }

        System.out.println(sum);

    }

}
