/**
 *  주제: 연결 요소의 개수
 *
 *  문제:
 *  방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 *
 *  입력:
 *  첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2)
 *  둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v)
 *  같은 간선은 한 번만 주어진다.
 *
 *  출력:
 *  첫째 줄에 연결 요소의 개수를 출력한다.
 */

import java.util.Scanner;

public class Q11724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력 1 (정점의 개수)
        int M = sc.nextInt(); // 입력 1 (간선의 개수)

        int arr[] = new int[M];
        int u, v;
        for (int i = 0; i < M; i++) {

        }

    }
}
