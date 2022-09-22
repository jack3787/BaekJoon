/**
 * 주제: 별 찍기 5
 *
 * Tip:
 * for문에 변수를 3개 사용했다.
 */

package plzrun1_InputOutput;

import java.util.Scanner;

public class Q2442_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = N;


        for (int j = 1; j <= N; j++) {
            for (int k = N-j; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2*j-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
