package plzrun_1_InputOutput;

/**
 * 주의:
 * 입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
 *
 * 새로 알게된 것:
 * hasNextInt = 입력받는 값이 있는가?
 * - while문에 조건을 걸어서 Scanner로 정수가 넘어오지 않는 경우, while문을 끝낸다.
 *
 * BufferedReader = Scanner와 비슷한 문법
 * - buffer = 데이터를 한 고셍서 다른 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
 * - 속도가 빠르다.
 * - 데이터가 String으로 고정된다.
 * - 엔터(개행문자)만 경계로 인식한다.
 * - try/catch 예외처리 또는 throws IOException을 통한 예외처리가 필요하다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10951_Fixed {

    //풀이1 - Scanner, hasNextInt
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }

        sc.close();
    }

    //풀이2 - BufferedReader
    void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        // 출력방법으로 사용한다.
        // 문자열을 다루는 클래스.
        // append()로 문자열을 추가한다.

        StringTokenizer st;

        String str;

        while ((str = br.readLine()) != null) { // readLine()은 한 줄을 읽기 때문에, 공백을 기준으로 문자열을 분리해야 한다.
            st = new StringTokenizer(str, " "); // BufferedReader에서 받은 Line단위의 문자를 공백단위로 처리하고 싶을 때 사용한다.
            int a = Integer.parseInt(st.nextToken()); // nextToken()으로 분리하면 문자열을 반환하므로 Integer.parseInt() 함수를 통해 Int형으로 반환한다.
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);

    }
}
