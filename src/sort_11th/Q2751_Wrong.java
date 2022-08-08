/**
 *  주제: 수 정렬하기 2
 *
 *  문제:
 *  N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 *  입력:
 *  첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 *  둘째 줄부터 N개의 줄에는 수가 주어진다.
 *  이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다.
 *  수는 중복되지 않는다.
 *
 *  출력:
 *  첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 *  주의사항:
 *  데이터가 1,000,000배 늘어났으므로 Arrays.sort() 방법은 시간초과가 발생한다.
 *
 */

package sort_11th;

import java.util.Arrays;
import java.util.Scanner;

public class Q2751_Wrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int N = sc.nextInt(); // N: 수의 개수
        int arr[] = new int[N]; // arr[]: 수를 입력할 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // N개의 줄에 수를 입력
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//public class Q2751 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int arr[] = new int[N];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}