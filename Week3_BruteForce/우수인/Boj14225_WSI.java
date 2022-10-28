import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    풀이방법
    1. 각자의 수열을 구함
    2. 부분 집합의 합을 구함 -> 조합으로(합의 경우 순서가 없으므로)
    3. int배열을 만들되 배열의 크기는 int형 최대로함
    4. 각 index = 부분집합의 합 숫자
    5. idx 0을 제외하고 value가 0인 idx를 출력
 */
public class Boj14225_WSI {
    private static boolean[] rnt;

    // 배열 출력
    static void cal(int[] arr, boolean[] visited, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                result += arr[i];
            }
        }
        rnt[result] = true;
    }

    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            cal(arr, visited, n);
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rnt = new boolean[100000000];
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            comb(arr, visited, 0, N, i);
        }

        for (int i = 1; i < rnt.length; i++) {
            if (!rnt[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
