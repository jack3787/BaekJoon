package plzrun_2_DP;

import java.util.Scanner;

public class Q1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dp[] = new int[N + 1]; // N+1 크기의 배열 dp를 선언한다.
        dp[0] = 0; // dp[0] 초기화
        dp[1] = 0; // dp[1] 초기화

        for (int i = 2; i <= N; i++) { // N-2번 반복
            dp[i] = dp[i - 1] + 1; // N이 나누어 떨어지는 것과 관계없는 N-1을 일단 dp[i]에 넣어둔다.
            // dp[2] = dp[1] + 1 = 1
            // dp[3] = dp[2] + 1 = 2
            // dp[4] = dp[3] + 1 = 3
            // dp[5] = dp[4] + 1 = 4
            if(i%2 == 0)
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            //  dp[2] = 최솟값(dp[1] + 1 = 1 과 dp[2] = 1 중에서) = 1
            //  dp[4] = 최솟값(dp[2] + 1 = 2 과 dp[4] = 3 중에서) = 2


        }



    }
}

// Math.min() 함수
// Math.min([value1
// 주어진 숫자들 중 가장 작은 값을 반환한다.

/**
 * 내가 작성한 코드 (틀림)
 */
//public class Q1463 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int count = 0;
//
//        while (N != 1) {
//            count ++;
//            if (N % 3 == 0) {
//                N = N / 3;
//            }
//            if (N % 2 == 0) {
//                N = N / 2;
//            }
//            if ((N % 2 != 0) || (N % 3 != 0)) {
//                N = N - 1;
//            }
//        }
//        System.out.println(count);
//    }
//}

