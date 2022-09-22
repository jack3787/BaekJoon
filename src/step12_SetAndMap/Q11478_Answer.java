/**
 *  주제: 서로 다른 부분 문자열의 개수
 *
 *  문제:
 *  문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
 *  부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
 *  예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.
 *
 *  입력:
 *  첫째 줄에 문자열 S가 주어진다.
 *  S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.
 *
 *  출력:
 *  첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.
 */

// ArrayList를 이용할 경우 시간초과 발생. HashSet을 이용해야 한다.
package step12_SetAndMap;

import java.util.HashSet;
import java.util.Scanner;

public class Q11478_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        /**
         *  HashSet (= Set 인터페이스의 구현 클래스)
         *  - 저장 순서가 유지되지 않음.
         *  - 중복을 허용하지 않음.
         *
         *  HashSet<String> set이름 = new HashSet<>();
         */
        HashSet<String> list = new HashSet<>();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!list.contains(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        System.out.println(sb);
//        System.out.println(list.size());
    }
}
