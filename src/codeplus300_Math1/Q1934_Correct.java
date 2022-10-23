package codeplus300_Math1;

import java.util.Scanner;

public class Q1934_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(lcm(A,B));
        }

    }

    static int gcd(int A, int B) {
        while (B != 0) {
            int r = A%B;
            A = B;
            B = r;
        }
        return A;
    }

    static int lcm(int A, int B) {
        return A * B / gcd(A, B);
    }
}
