package conditionalStatement;

/**
 *  주사위 세개
 *
 *  오류 >>
 *  주사위 값이 랜덤이 아닌, 입력 받는 값이었다.
 */

import java.util.Scanner;

public class Q2480_Answer {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int reward = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();  

        if((a==b)&&(b==c)){
            reward = 10000 + a * 1000;
        }

        else if((a==b)&&(a!=c)){
            reward = 1000 + a * 100;
        }
        else if((b==c)&&(b!=a)){
            reward = 1000 + b * 100;
        }
        else if((c==a)&&(c!=b)){
            reward = 1000 + c * 100;
        }

        else {
            reward = Math.max(a, Math.max(b, c)) * 100;
        }
//        else {
//            if((a>b)&&(a>c)){
//                reward = 100 * a;
//            }
//            if((b>a)&&(b>c)){
//                reward = 100 * b;
//            }
//            if((c>a)&&(c>b)){
//                reward = 100 * c;
//            }
//        }

        System.out.println(reward);
    }
}

