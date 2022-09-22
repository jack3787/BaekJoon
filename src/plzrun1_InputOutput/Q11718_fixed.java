package plzrun1_InputOutput;

/**
 * 주의:
 * 입력 값의 조건을 어디까지 적용해야 하는지 잘 생각하자.
 */

import java.util.Scanner;

public class Q11718_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
    }
}



/**
 * 나의 처음 풀이
 */

//public class Q11718 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        for(int i=0; i<100; i++) {
//            String input = sc.nextLine();
//            if((input.charAt(0) == null)||(input != (input + " "))) {
//                System.out.println(input);
//            }
//            else{
//                break;
//            }
//        }
//    }
//}
