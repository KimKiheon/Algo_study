import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 신기한 소수 - 2023번
 */
public class g5_2023 {
    static StringBuffer sb = new StringBuffer();
    static int N;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dfs(0,0);
        System.out.println(sb);

    }

    public static void dfs(int num, int count) {

        if(count == N) {
            if(isPrime(num))
                sb.append(num).append("\n");
        }

        for(int i = 1; i < 10; i++) {
            int nextNum = 10 * num + i;
            if(isPrime(nextNum)) {
                dfs(nextNum,count+1);
            }
        }
    }
    public static boolean isPrime(int num) {

        if(num < 2) return false;
        if(num == 2) return true;

        for(int i = 2; i < Math.sqrt(num) + 1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}



//    public static void dfs(String s, int num) {
//
//        if(num == N) {
//            sb.append(s).append("\n");
//
//        }
//
//        for(int i = 1; i < 10; i++) {
//            if(isPrime(Integer.parseInt(s+i))) {
//                dfs(s+i,num+1);
//            }
//
//        }
//
//    }

