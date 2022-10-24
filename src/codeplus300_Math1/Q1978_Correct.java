/**
 * 소수 찾기
 */

package codeplus300_Math1;

import java.util.Scanner;

public class Q1978_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dec;
        int count = 0;

        for (int i = 0; i < N; i++) {
            dec = sc.nextInt();

            for (int j = 2; j <= dec; j++) {
                if (dec == 2) {
                    count++;
                    break;
                }
                if ((dec % j == 0)) {
                    break;
                }
                if (j == (dec - 1) && dec % j != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
