/**
 *  주제: 수 정렬하기 3
 *
 *  문제:
 *  N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 *  입력:
 *  첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
 *  둘째 줄부터 N개의 줄에는 수가 주어진다.
 *  이 수는 10,000보다 작거나 같은 자연수이다.
 *
 *  출력:
 *  첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

package step9_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q10989 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력1

        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
