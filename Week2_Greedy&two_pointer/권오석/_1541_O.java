import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  잃어버린 괄호 - 1541번
 *  -를 기준으로 나눠서 더하는게 제일 작다.
 */
public class _1541_O {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split("-");

        int[] sum = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            String[] sp = s[i].split("\\+");
            for(int j = 0; j < sp.length; j++) {
                sum[i] += Integer.parseInt(sp[j]);
            }
        }
        int result = sum[0]; // 처음 숫자는 더하여야 한다.
        for(int i = 1; i < sum.length; i++) {
            result -= sum[i];
        }
        System.out.println(result);

    }
}
