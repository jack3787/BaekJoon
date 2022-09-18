/**
 * 주제: 합
 *
 */

package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q8393_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (n - i);
        }

        System.out.println(sum);
    }
}
