// ArrayList를 이용할 경우 시간초과 발생. HashSet을 이용해야 한다.

package setAndMap_12th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q11478_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

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
    }
}
