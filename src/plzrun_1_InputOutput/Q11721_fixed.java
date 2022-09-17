/**
 * 주제: 열 개씩 끊어 출력하기
 *
 * 주의:
 * 더 긴 입력값을 넣었을 때의 검증이 모자랐다.
 */

package plzrun_1_InputOutput;

import java.util.Scanner;

public class Q11721_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if(i % 10 == 9){ // ***
                System.out.println();
            }
        }


    }
}
