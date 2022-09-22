package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q2446_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

//        2N-1 인데, N이 1씩 줄어든다
        for (int j = N; j >= 1; j--) {
            for (int i = j; i < N; i++) {
                System.out.print(" ");
            }
            for (int i = 2 * j - 1; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 2; j <= N; j++) {
            for (int i = j; i < N; i++) {
                System.out.print(" ");
            }
            for (int i = 2 * j - 1; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
