import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    전화번호 목록

    풀이방법
    1. 한 개를 지정하여 전체를 비교 -> 시간이 너무오래걸림
    2. 정렬 후 한개와 그다음꺼가 접두어인지 비교
    3. startsWith 사용
 */
public class Boj5052_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String rnt = "";
        int t = Integer.parseInt(br.readLine());    //테스트케이스

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());    //전화번호 갯수
            String[] num = new String[n];

            for (int j = 0; j < n; j++) {
                num[j] = br.readLine();
            }

            Arrays.sort(num);
            for (int j = 0; j < n - 1; j++) {
                if (num[j+1].startsWith(num[j])){
                    rnt = "NO";
                    break;
                } else
                    rnt = "YES";
            }

            System.out.println(rnt);
        }


    }
}
