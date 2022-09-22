/**
 *  주제: 소트인사이드
 *
 *  문제:
 *  배열을 정렬하는 것은 쉽다.
 *  수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 *
 *  입력:
 *  첫째 줄에 정렬하려고 하는 수 N이 주어진다.
 *  N은 1,000,000,000보다 작거나 같은 자연수이다.
 *
 *  출력:
 *  첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 *
 *  힌트:
 *  오름차순 정렬 = Arrays.sort(arr);
 *  내림차순 정렬 = Arrays.sort(arr,Collections.reverseOrder());
 */


package step9_Sort;

import java.util.Scanner;

public class Q1427_Wrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = N / 1000000000;
//        int b = N % 1000000000 / 100000000;
//        int c = N % 100000000 / 10000000;
//        int d = N % 10000000 / 1000000;
//        int e = N % 1000000 / 100000;
//        int f = N % 100000 / 10000;
//        int g = N % 10000 / 1000;
//        int h = N % 1000 / 100;
//        int i = N % 100 / 10;

        int arr[] = new int[9];
        for (int j = 0; j < 9; j++) {
            for (int j2 = 1000000000; j2 > 0; ) {
                arr[j] = N % j2 / (j2 / 10);
                j2 = j2 / 10;
            }
        }
//        Arrays.sort(arr, Collections.reverseOrder());

        for (int j = 0; j < 9; j++) {
            System.out.println(arr[j]);
        }
    }
}
