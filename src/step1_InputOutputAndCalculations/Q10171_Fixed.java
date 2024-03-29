/**
 *  주제: 고양이
 *
 *  문제:
 *  아래 예제와 같이 고양이를 출력하시오.
 *
 *  예제:
 *  \    /\
 *   )  ( ')
 *  (  /  )
 *   \(__)|
 *
 *  힌트:
 *  자바에서는 몇몇 문자는 단독으로 써서 출력할 수 없다. ( 대표적으로 백슬래시와 큰 따옴표가 있다. )
 *  그래서 문자를 출력하기 위해 조합을 만들어서 출력할 수 있도록 하는데 이를 Escape Sequance 라고 한다.
 *  이스케이프 시퀀스는 백슬래시(\) + 문자 의 조합으로 쓰인다.
 *  ex) "\\"의 출력 = \
 */

package step1_InputOutputAndCalculations;

public class Q10171_Fixed {
    public static void main(String[] args) {

        System.out.println("\\    /\\ ");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}
