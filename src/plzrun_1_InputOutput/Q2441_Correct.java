package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q2441_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int j = N; j >= 1; j--) {
            for (int i = 1; i <= N - j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
