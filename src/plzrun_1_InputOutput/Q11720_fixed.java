package plzrun_1_InputOutput;

/**
 * 주제: 숫자의 합
 *
 * 주의:
 * 아스키코드의 특징
 */

import java.util.Scanner;

public class Q11720_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 숫자의 개수

        String input = sc.next(); // 입력받는 수

        int sum = 0; // 총합

        for (int i = 0; i < N; i++) {
            sum += input.charAt(i) - 48; // 숫자 CHAR(0~9)는 ASCII 코드 48부터 시작하므로, 48을 빼주면 숫자를 얻을 수 있다.
        }

        System.out.println(sum);

    }
}





/**
 * 모르는 점:
 * 각 자릿수를 변수에 지정해주는 데에서 부터 오류가 났다.
 * 그냥 처음 자릿수부터 차례대로 더해주면 되는 거였다.
 */
//public class Q11720 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        String input;
//
//        input = sc.next();
//
//        for (int i = 0; i < input.length(); i++) {
//            String digit = String.valueOf(input.charAt(i));
//            int num = Integer.parseInt(input.charAt(i));
//
//        }
//
//    }
//}
