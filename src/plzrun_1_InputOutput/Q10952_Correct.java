package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q10952_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if ((A == 0) && (B == 0)) {
                break;
            }
            System.out.println(A+B);
        }
    }
}
