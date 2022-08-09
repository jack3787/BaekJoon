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


package cumulativeSum_17th;

import java.util.Scanner;

public class Q11659_TimeOver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫째 줄 입력
        int M = sc.nextInt(); // 첫째 줄 입력

        int arr[] = new int[N]; //arr[0]~arr[4] 배열을 만든다.
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 둘째 줄 입력
        }

        int sum = 0;
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (int mm = i-1; mm <= j-1; mm++) { // i번째 수 = [i-1]에 입력하는 수 !!!!!!!!!
                sum += arr[mm];
            }
            System.out.println(sum);
        }
    }
}
