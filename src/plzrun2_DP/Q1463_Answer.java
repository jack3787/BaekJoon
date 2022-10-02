package plzrun2_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463_Answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1;

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}

/**
 * 풀이:
 * - dp[0] = dp[1] = 0      // dp에서 0과 1일 때는 0이 되므로, dp[0]과 dp[1]의 값은 0으로 넣는다.
 * - dp[2] = dp[1] + 1 = 1  // 2 % 2 == 0
 * - dp[3] = dp[1] + 1 = 1  // 3 % 3 == 0
 * - dp[4] = dp[2] + 1 = 2  // 4 % 2 == 0, 2 % 2 == 0
 */