package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q10992_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int a = 1; a <= N - 1; a++) { // 1층
            System.out.print(" ");
        }
        System.out.println("*");

        for (int j = 2; j <= N-1; j++) { // 2 ~ N-1층 반복

            // 첫번째 공백 *
            for (int k = j; k <= N-1; k++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // 두번째 공백 *
            for (int i = 1; i <= (j-1) * 2 - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int b = 1; b <= 2 * N - 1; b++) {
            if (N == 1) {
                break;
            }
            System.out.print("*");
        }
    }
}
