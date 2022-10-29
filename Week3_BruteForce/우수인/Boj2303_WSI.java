import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2303_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[5];
        int[] rnt = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                card[j] = Integer.parseInt(st.nextToken());
            }

            int maxOne = 0;

            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        maxOne = Math.max(maxOne, (card[j] + card[k] + card[l]) % 10);
                    }
                }
            }

            rnt[i] = maxOne;
        }

        int max = 0;

        for (int i = 0; i < rnt.length; i++) {
            max = Math.max(max, rnt[i]);
        }

        int idx = 0;
        for (int i = 0; i < rnt.length; i++) {
            if (rnt[i] == max && i >= idx)
                idx = i;
        }

        System.out.println(idx+1);

    }
}
