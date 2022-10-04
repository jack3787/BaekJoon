/**
 * 주제: 쉬운 계단 수
 */

package plzrun2_DP;


import java.util.Scanner;

public class Q10844_Answer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int MOD = 1000000000;
        int dp[][] = new int[101][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
//        dp[1][1] = 1, dp[1][2] = 1, ... , dp[1][9] = 1

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= 8; j++) {
                // i 길이의 수 마지막 부분이 j일 때 계단 수
                dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%MOD;
            }
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
        }

        int ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += dp[N][i] % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
