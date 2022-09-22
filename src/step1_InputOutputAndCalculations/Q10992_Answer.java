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
 *
 *  주의:
 *  print와 prinln 구분
 *  세로열 자릿수, 가로열 자릿수 헷갈리지 않게 통일
 */

package step1_InputOutputAndCalculations;

import java.util.Scanner;

public class Q10992_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 첫줄
        // i: 가로열 자릿수
        for (int j = 1; j < N; j++) { // 1~N-1번째 자리까지 반복
            System.out.print(" "); // 띄어쓰기 출력
        }
        System.out.println("*"); // N번째 자리에 * 출력

        // 중간줄
        // i: 세로열 자릿수
        for (int i = 2; i < N; i++) { // 2번째 줄부터 N-1번째 줄까지 반복
            // j: 가로열 자릿수
            for (int j = N - i; j > 0; j--) { // 앞 공백
                System.out.print(" ");
            }
            System.out.print("*");

            // j: 가로열 자릿수
            for (int j = 1; j <=(2*i-3); j++) { // 중간 공백
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // 마지막줄
        if(N!=1) {
            for (int j = 1; j < 2 * N; j++) {
                System.out.print("*");
            }
        }

    }
}


// i=2일 때, j=1
// i=3, j=3
// i=4, j=5
// i=5, j=7