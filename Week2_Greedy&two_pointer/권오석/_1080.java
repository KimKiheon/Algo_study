import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 행렬 - 1080번
 */
public class _1080 {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }
}
