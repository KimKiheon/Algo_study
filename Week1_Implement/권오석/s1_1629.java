import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 곱셈 - 1629번
 */
public class s1_1629 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(modBy(A,B,C));
    }

    public static long modBy(long base,long idx,long mod) {

        if(idx == 1) {
            return base % mod;
        }

        if (idx % 2 == 0) {
            long r = modBy(base, idx / 2, mod) % mod;
            return r * r % mod;
        } else {
            return (base * modBy(base,idx-1,mod)) % mod;
        }

//        long r = modBy(base, idx / 2, mod);
//
//        if (idx % 2 == 0) {
//            return r * r % mod;
//        } else {
//            return (r * r % mod) * (base % mod) % mod;
//        }

    }
}
