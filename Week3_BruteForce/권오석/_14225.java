import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14225 {

    static int N;
    static int[] S;
    static boolean[] check = new boolean[2000000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            subsequence(i, S[i]);
        }

        int num = 1;
        int result = 0;
        while(true) {

            if(!check[num]) {
                result = num;
                break;
            }
            num++;
        }
        System.out.println(result);

    }

    static void subsequence(int idx, int num) {
        check[num] = true;
        for(int i = idx+1; i < N; i++)
            subsequence(i,num+S[i]);
    }
}
