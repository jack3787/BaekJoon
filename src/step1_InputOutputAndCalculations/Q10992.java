/**
 *  주제: 별 찍기 - 17
 *
 *  문제:
 *  예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 *  입력:
 *  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 *  출력:
 *  첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

package step1_InputOutputAndCalculations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 입력


        /**
         *  첫번째 줄:
         */
        for (int i = 0; i < N; i++) {
            System.out.println(" ");
            if (i == N - 1) {
                System.out.println("*");
                break;
            }
        }

        /**
         *  중간 줄:
         */
        for (int i = 1; i < N - 1; i++) { // 중간 층 N-2만큼 반복
            for (int j = N - 2; j < 1; j--) {
                System.out.println(" ");
            }
        }



    }
}