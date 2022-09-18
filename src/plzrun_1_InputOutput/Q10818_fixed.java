/**
 * 주제: 최소, 최대
 *
 * 주의:
 * 방법 1) arrays.sort() 메소드를 사용해서 정렬을 해줘야 한다.
 * 방법 2) min = max = arr[0]
 */

package plzrun_1_InputOutput;


import java.util.Scanner;

//public class Q10818 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int arr[] = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        sc.close();
//
//        Arrays.sort(arr);
//        System.out.println(arr[0] + " " + arr[N-1]);
//    }
//
//}


public class Q10818_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 입력받을 정수의 갯수
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];


        for(int j=0; j<arr.length; j++) {
            if(min > arr[j]) {
                min = arr[j];
            }
            if(max < arr[j]) {
                max = arr[j];
            }
        }

        System.out.println(min + " " + max);
    }

}
