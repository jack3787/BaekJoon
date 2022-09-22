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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1253_Answer {
    public static void main(String[] args) throws NumberFormatException, IOException {
    //                                                                   readLine을 위한 예외처리

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //  Scanner        sc = new Scanner       (System.in);

        int N = Integer.parseInt(bf.readLine()); // 첫 번째 입력
    //  int N = sc.nextInt();
        //  Integer => sc
        //  parse => next
        //  (bf.readLIne()) => ()

        int Result = 0; // 정수 변수 Result 선언 및 초기화

        long A[] = new long[N]; // 배열 A[] 선언

        StringTokenizer st = new StringTokenizer(bf.readLine());
    //  Read한 데이터는 Line단위로만 나눠지기에,
    //  공백단위로 데이터를 가공하려면 따로 작업을 해주어야 한다.

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        //  StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.
        }

        Arrays.sort(A); // 배열 A[] 오름차순 정렬

        for (int k = 0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N - 1;

            // 투 포인터 알고리즘
            while (i < j) {
                if (A[i] + A[j] == find) {
                    // find는 서로 다른 두 수의 합이어야 함을 체크
                    if ((i != k) && (j != k)) {
                        Result++;
                        break;
                    }
                } else if (i == k) {
                    i++;
                } else if (j == k) {
                    j--;
                } else {
                    j--;
                }
            }
        }

        System.out.println(Result);
        bf.close();
    }
}
