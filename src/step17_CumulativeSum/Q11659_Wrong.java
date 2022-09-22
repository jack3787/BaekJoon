/**
 *  주제: 구간 합 구하기 4
 *
 *  문제:
 *  수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 *
 *  입력:
 *  첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
 *  둘째 줄에는 N개의 수가 주어진다.
 *  수는 1,000보다 작거나 같은 자연수이다.
 *  셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 *
 *  출력:
 *  총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 */


package step17_CumulativeSum;

import java.util.Scanner;

public class Q11659_Wrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫째 줄 입력
        int M = sc.nextInt(); // 첫째 줄 입력

        int arr[] = new int[N]; // arr[0]~arr[N-1] 배열을 생성
        int sum[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 둘째 줄 입력: arr[0]~arr[N-1] 입력
            sum[i] += arr[i]; // 합 배열 만들기
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            System.out.println(sum[j] - sum[i-1]);
        }
    }
}
