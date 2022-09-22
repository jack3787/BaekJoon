package plzrun1_InputOutput;

import java.util.Scanner;

public class Q2445_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        // 처음
        for (int j = N-1; j >= 1; j--) {
            for (int i = 1; i <= N-j; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= 2 * j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= N-j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 중간
        for (int i = 1; i <= 2 * N; i++) {
            System.out.print("*");
        }
        System.out.println();


        // 마지막
        for (int j = 1; j <= N - 1; j++) {
            for (int i = N - j; i >= 1; i--) {
                System.out.print("*");
            }
            for (int i = 2 * j; i >= 1; i--) {
                System.out.print(" ");
            }
            for (int i = N - j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
