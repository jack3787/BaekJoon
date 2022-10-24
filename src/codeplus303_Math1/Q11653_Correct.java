/**
 * 주제: 소인수분해
 */

package codeplus303_Math1;

import java.util.Scanner;

public class Q11653_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i <= N; ) {
            if ((N / i == 1) && (N % i == 0)) {
//                System.out.println("N1= " + N);
                System.out.println(i);
                break;
            }
            if (N % i == 0) {
                N /= i;
//                System.out.println("N2= " + N);
                System.out.println(i);
                i=1;
            }
            i++;
        }
    }
}
