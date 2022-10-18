import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 수 이어 쓰기 1 - 1748번
 */
public class s4_1748 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int n = N;
        int sum = 0; //
        int cnt = 0; // N의 자릿수

        while (true) {
            n /= 10;
            cnt++;
            if(n == 0) break;
        }

        for(int i = 1; i < cnt; i++) {
            sum += i * (9 * (Math.pow(10,i-1)));
        }

        sum += (N-Math.pow(10,cnt-1)+1) * cnt;

        System.out.println(sum);

    }
}
