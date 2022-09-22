/**
 * 주제: 구구단
 */

package plzrun1_InputOutput;

import java.util.Scanner;

public class Q2739_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }


    }
}
