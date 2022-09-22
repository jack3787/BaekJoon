import java.util.Scanner;

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
 *
 *  풀이:
 *  방문 배열을 만들어서
 *  처음부터 돌면서 방문하지 않은 정점이 있다면 DFS(=Depth First Search)탐색을 돌리고, 연결요소개수 1개 증가.
 */


public class Q11724_Answer {
    static int N; // 정점의 개수
    static int M; // 간선의 개수
    static int[][] adj; // 인접행렬 2차 배열

    static boolean[] visit; // 방문체크 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  // 입력 1: 정점의 개수
        M = sc.nextInt();  // 입력 1: 간선의 개수

        adj = new int[N+1][N+1];

        // 인접행렬 입력
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        visit = new boolean[N + 1];

        int count = 0; // 연결요소 개수

        for (int i = 1; i < N + 1; i++) {
            if (!visit[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int start) {
        // 방문했다.
        visit[start] = true;

        for (int i = 1; i <= N; i++) {
            if (adj[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }

    }
}
