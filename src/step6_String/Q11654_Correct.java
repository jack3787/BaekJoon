package step6_String;
/**
 * 주제:
 * String -> ASCII 코드
 * charAt(0): String으로 저장된 문자열을 char형으로 변경해준다.
 *
 * 문제: 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 입력: 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출력: 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */


import java.util.Scanner;

public class Q11654_Correct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x = scanner.nextLine().charAt(0);
        System.out.println((int)x);
    }
}
