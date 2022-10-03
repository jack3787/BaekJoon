package plzrun2_DP;

import java.util.Scanner;

public class Q11726_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력
        int n = sc.nextInt();

        int dp[] = new int[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        recur(dp, n);

        System.out.println(recur(dp, n));
    }

    public static int recur(int dp[], int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        return dp[n];
    }
}
