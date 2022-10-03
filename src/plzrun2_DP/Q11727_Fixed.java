/**
 * 주제: 2xn 타일링 2
 */

package plzrun2_DP;

import java.util.Scanner;

public class Q11727_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력
        int n = sc.nextInt();

        // 입력 조건에 맞춰 배열의 크기 설정
        int dp[] = new int[1001];

        // 점화식 구하기
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        recur(dp, n);

        System.out.println(recur(dp, n));
    }

    public static int recur(int dp[], int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007 ;
            // for문의 각 연산마다 % 10007을 미리 해주는 것은 오버플로우 때문이다.
        }

//        return dp[n] % 10007;
        return dp[n];
    }
}

/**
 * 야콥스탈 수의 점화식
 */