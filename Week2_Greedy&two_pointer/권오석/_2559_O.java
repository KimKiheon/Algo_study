import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수열 - 2559번
 */
public class _2559_O {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int j = 0; j < K; j++)  {
            sum += arr[j];
        }
        int max = sum;

        for(int i = 0; i < N-K; i ++) {
            sum = sum - arr[i] + arr[i+K];
            max = Math.max(max, sum);
        }
        System.out.println(max);

//        int end = 0;
//        int max = Integer.MIN_VALUE;
//        int interval_sum = 0;
//
//        for(int start = 0; start <= N-K; start++) {
//            end = start;
//            while(end <= start + K - 1) {
//                interval_sum += arr[end];
//                end++;
//            }
//            if(interval_sum > max) {
//                max = interval_sum;
//            }
//            interval_sum = 0;
//        }
//        System.out.println(max);
    }
}
