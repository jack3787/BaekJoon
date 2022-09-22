/**
 *  주제: 좋다 ('좋은 수' 구하기)
 *
 *  문제:
 *  N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
 *  N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
 *  수의 위치가 다르면 값이 같아도 다른 수이다.
 *
 *  입력:
 *  첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다.
 *  (|Ai| ≤ 1,000,000,000, Ai는 정수)
 *
 *  출력:
 *  좋은 수의 개수를 첫 번째 줄에 출력한다.
 *
 *  힌트:
 *  3,4,5,6,7,8,9,10은 좋다.
 */

package step27_TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Q1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫 번째 줄 입력
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 두 번째 줄 입력
        }

        // 임의의 N개의 수를 입력했으므로, 오름차순 정렬은 필수이다.
        Arrays.sort(arr);

    }
}
