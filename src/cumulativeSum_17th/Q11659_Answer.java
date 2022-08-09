/**
 *  풀이:
 *  구간 합을 이용해 시간 복잡도를 줄여야 한다.
 *
 *  구간 합을 활용하려면 먼저 합 배열을 구해야 한다.
 *  A[i]: 배열
 *  S[i]: 합 배열
 *
 *  S[i] = A[0] + A[1] + ... + A[i-1] + A[i] // A[0]부터 A[i]까지의 합
 *       = S[i-1] + A[i]
 */

package cumulativeSum_17th;

import java.util.Scanner;

public class Q11659_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N+1]; // arr[0] ~ arr[N] 배열 생성
        arr[0] = 0;
        for (int i = 1; i <= N; i++) { // 합배열 arr 생성
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(arr[j] - arr[i-1]);
        }

    }
}
