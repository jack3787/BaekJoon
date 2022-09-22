package plzrun1_InputOutput;

/**
 *  주의:
 *  StringTokenizer를 통해 "," 기준으로 분리한다.
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10953_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            st = new StringTokenizer(str, ",");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }
        sc.close();
    }
}
