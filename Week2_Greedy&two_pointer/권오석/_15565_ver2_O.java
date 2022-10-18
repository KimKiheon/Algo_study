import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15565_ver2_O {

    static int N;
    static int K;
    static int[] arr;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        two_pointer();
    }

    public static void two_pointer() {

        int left = 0;
        int right = 0;

        int cnt = 0;
        int size = Integer.MAX_VALUE;

        while(true) {
            if (cnt < K) {
                if (right == N)
                    break;
                if (arr[right] == 1)
                    cnt++;
                right++;
            } else {
                size = Math.min(size, right - left);
                if (arr[left] == 1)
                    cnt--;
                left++;
            }
        }
        System.out.println(size == Integer.MAX_VALUE ? -1 : size);
    }
}
