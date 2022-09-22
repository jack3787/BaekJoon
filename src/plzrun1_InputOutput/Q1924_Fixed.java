/**
 * 주제: 2007년
 *
 *
 */

package plzrun1_InputOutput;

import java.util.Scanner;

public class Q1924_Fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 월, 일 입력
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 월, 일, 요일을 배열에 담는다
        int [] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            // 1월1일이 MON 이고 배열은 [0] 부터 시작하므로 SUN부터 시작한다
            // 1월5일을 구하려고 할 때, FRI 이다. dayOfWeek[5] = 배열의 6번째 값이 나와야 한다.

        // sum = 입력받은 월까지의 일 수의 합
        int sum = 0;

        // sum을 구한다
        for (int i = 0; i < x - 1; i++) {
            sum += dayOfMonth[i];
        }

        // sum과 x(구하려고 하는 달)의 y(일 수)를 더한다
        sum += y;

        System.out.println(dayOfWeek[sum%7]);

    }
}


/**
 * 내 첫 코드
 */
//public class Q1924 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        String arr[][] = new String[12][31];
//
//        for (int i = 1; i <= 12; i++) {
//            if((i == 1)||(i == 3)||(i == 5)||(i == 7)||(i == 8)||(i == 10)||(i == 12)) { // 31일까지
//                for (int j = 1; j <= 31; j++) {
//                    if(j%)
//                    arr[i][j] =
//                }
//            }
//            else if((i == 4)||(i == 6)||(i == 9)||(i == 11)){ // 30일까지
//                for (int j = 1; j <= 30; j++) {
//
//                }
//            }
//            else if((i == 2)){
//                for (int j = 1; j <= 28; j++) { // 28일까지
//
//                }
//            }
//        }
//
//
//    }
//}
