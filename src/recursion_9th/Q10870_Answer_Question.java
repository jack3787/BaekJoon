package recursion_9th;
/**
 *  주제: 피보나치 수 5
 *
 *  문제:
 *  피보나치 수는 0과 1로 시작한다.
 *  0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 *  그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *  이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 *  n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *  n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 *  입력:
 *  첫째 줄에 n이 주어진다.
 *  n은 20보다 작거나 같은 자연수 또는 0이다.
 *
 *  출력:
 *  첫째 줄에 n번째 피보나치 수를 출력한다.
 */
import java.util.Scanner;

public class Q10870_Answer_Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 테스트
        int N = in.nextInt();
        System.out.println(fibonacci(N));
    }

    // 피보나치 함수
    // fibonacci(N) = fibonacci(N-1) + fibonacci(N-2);
    static int fibonacci(int N) { // static을 사용하면, main에서 객체를 생성하지 않아도 fibonacci함수를 사용할 수 있다.
        if (N == 0)	return 0;
        if (N == 1)	return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}

/**
 *  질문:
 *  static 함수와 객체의 차이점..?
 */
