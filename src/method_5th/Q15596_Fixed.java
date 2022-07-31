/**
 *  주제: 정수 N개의 합
 *
 *  문제:
 *  정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 *  작성해야 하는 함수는 다음과 같다.
 *
 *  long sum(int[] a); (클래스 이름: Test)
 *  a = 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
 *  리턴값 = a에 포함되어 있는 정수 n개의 합
 *
 *  주어진 코드:
 *  public class Test {
 *     long sum(int[] a) {
 *         long ans = 0;
 *         return ans;
 *     }
 * }
 */

package method_5th;

public class Q15596_Fixed {
    long sum(int[] a) {
        long ans = 0;

        for(int i=0; i<a.length; i++){
            ans += a[i];
        }

        return ans;
    }
}

