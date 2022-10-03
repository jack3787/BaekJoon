/**
 * 주제: 1, 2, 3 더하기
 */

package plzrun2_DP;

import java.util.Scanner;

public class Q9095_Correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int T = sc.nextInt();

//        // 정수 n 입력
//        int n = sc.nextInt();

        // 각 테스트 케이스 별, 방법의 수
        int dp[] = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(recur(dp, n));
        }

    }

    public static int recur(int dp[], int n) {
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        return dp[n];
    }

}
