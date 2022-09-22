package step5_Method;

/***
 * 주제:
 * 정수 n개의 합
 *
 * 문제:
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * long sum(int[] a); (클래스 이름: Test)
 * a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
 * 리턴값: a에 포함되어 있는 정수 n개의 합
 */

public class Q15596_Answer {
    long sum(int[] a) {
        long sum = 0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
    }
}

// long sum(int[] a) {}가 의미하는 것은 무엇인가?
// 매개변수가 (int[] a)인 sum(){} 메소드

//

// 왜 long으로 변수 선언을 하는가?
