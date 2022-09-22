package step10_Recursion;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = N;


        while (N >= 0) {
            if (N == 1) {
                break;
            }
            else if (N == 0) {
                sum = 1;
                break;
            }
            sum = sum * (N - 1);
            N--;
        }

        System.out.println(sum);
    }
}
