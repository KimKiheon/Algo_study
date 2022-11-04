import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    뒤집기
 */
public class Boj1439_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st0 = new StringTokenizer(str, "0");
        StringTokenizer st1 = new StringTokenizer(str, "1");

        int cnt0 = st0.countTokens();
        int cnt1 = st1.countTokens();

        if (cnt0 > cnt1)
            System.out.println(cnt1);
        else
            System.out.println(cnt0);
    }
}
