import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/**
 * 나는야 포켓몬 마스터 이다솜 - 1620번
 * 함수 이용
 * 58292 KB, 628 ms
 */
public class _1620_ver2 {

    static BufferedReader br;
    static int N;
    static int M;
    static StringBuffer sb;

    public static void getPocketmon() throws IOException {
        sb = new StringBuffer();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(String.valueOf(i + 1), name);
            map.put(name, String.valueOf(i + 1));
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            sb.append(map.get(input)).append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        getPocketmon();

    }
}
