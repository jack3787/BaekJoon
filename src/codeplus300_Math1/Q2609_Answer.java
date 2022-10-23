package codeplus300_Math1;

import java.util.Scanner;

public class Q2609_Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x, y));
        System.out.println(lcm(x, y));
    }

    static int gcd(int x, int y) {
        // 유클리드 호제법
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }
}
