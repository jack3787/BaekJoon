package plzrun1_InputOutput;

import java.util.Scanner;

public class Q10991_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int j = 1; j <= N; j++) {
            for (int i = j; i < N; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
