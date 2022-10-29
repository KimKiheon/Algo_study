import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10972 {
    static int N;
    static int[] arr;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        permutation(arr);
    }

    public static void permutation(int[] arr) {

        boolean flag = true;
        int idx = 0;
        for(int i = N-1; i > 0; i--) {
            if(arr[i] > arr[i-1]) {
                for(int j = N-1; j >= i; j--) {
                    if(arr[j] > arr[i-1]) {
                        int tmp = arr[j];
                        arr[j] = arr[i-1];
                        arr[i-1] = tmp;
                        idx = i;
                        flag = false;
                        break;
                    }
                }
                break;
            }
        }

        int end = N-1;
        while(idx < end) {
            int tmp = arr[idx];
            arr[idx] = arr[end];
            arr[end] = tmp;
            idx++;
            end--;
        }

        if(flag) sb.append(-1);
        else {
            for(int i : arr) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);

    }

}
