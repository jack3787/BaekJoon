package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q2522_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int j = 1; j <= N; j++) {
            for (int i = N-j; i>=1; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = N-1; j >= 1; j--) {
            for (int i = 1; i <= N-j; i++) {
                System.out.print(" ");
            }
            for (int i = j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
