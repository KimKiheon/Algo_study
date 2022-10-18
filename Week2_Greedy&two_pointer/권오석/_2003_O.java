import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수들의 합 2
 */
public class _2003_O {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int end = 0;
        int interval_sum = 0;
        int cnt = 0;

        for(int start = 0; start < N; start++) {
            while(interval_sum < M && end < N) {
                interval_sum += arr[end];
                end++;
            }
            if(interval_sum == M) {
                cnt++;
            }
            interval_sum -= arr[start];

        }
        System.out.println(cnt);
    }
}
