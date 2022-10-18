import java.io.*;
import java.util.*;

/**
 * 상근이의 여행 - 9372번
 */
public class s4_9372 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for(int j = 0; j < M; j++) {
                br.readLine();
            }
            sb.append((N-1) + "\n");
        }
        System.out.println(sb);

    }
//    static int[][] plane;
//    static boolean[] visit;
//    static int N, M, result;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer();
//        StringTokenizer st;
//
//        int T = Integer.parseInt(br.readLine());
//
//        while (T-- > 0) {
//            st = new StringTokenizer(br.readLine());
//            N = Integer.parseInt(st.nextToken());
//            M = Integer.parseInt(st.nextToken());
//            result = 0;
//
//            plane = new int[N + 1][N + 1];
//            visit = new boolean[N + 1];
//
//            for (int i = 0; i < M; i++) {
//                st = new StringTokenizer(br.readLine());
//                int u = Integer.parseInt(st.nextToken());
//                int v = Integer.parseInt(st.nextToken());
//
//                plane[u][v] = 1;
//                plane[v][u] = 1;
//
//            }
//            bfs();
//            sb.append((result-1) + "\n");
//        }
//
//        System.out.println(sb);
//    }
//
//    public static void bfs() {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(2);
//        visit[2] = true;
//        while (!queue.isEmpty()) {
//            result++;
//            int value = queue.poll();
//            for (int i = 1; i <= N; i++) {
//                if (plane[value][i] != 0 && !visit[i]) {
//                    visit[i] = true;
//                    queue.add(i);
//                }
//            }
//        }
//    }
}
