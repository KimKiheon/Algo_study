import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2303 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][5];
        int[][] idx = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

            int tmp = Integer.MIN_VALUE;
            for(int j = 0; j < 5; j++) {
                for(int k = j+1; k < 5; k++) {
                    for(int l = k+1; l < 5; l++) {
                        tmp = Math.max(tmp, (arr[i][j] + arr[i][k] + arr[i][l]) % 10);
                    }
                }
            }
            idx[i][0] = i+1;
            idx[i][1] = tmp;
        }

        Arrays.sort(idx,(a,b) -> {
            if(a[1] == b[1]) {
                return b[0] - a[0];
            } else{
                return b[1] - a[1];
            }
        });

        System.out.println(idx[0][0]);

    }
}
