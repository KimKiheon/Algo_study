import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 뒤집기 - 1439번
 */
public class _1439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                cnt++;
            }
        }

        if(cnt == 0) System.out.println(0);
        else if (cnt == 1) System.out.println(1);
        else if (cnt % 2 == 0) System.out.println(cnt/2);
        else if (cnt % 2 == 1) System.out.println(cnt/2 + 1);

    }
}
