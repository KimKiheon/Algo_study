import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    팰린드롬 만들기

    풀이방법
    1. 대문자 ascii A = 65 / Z = 90
    2. 각자 자기 배열방 만들어서 갯수 넣기
    3. 짝수들은 2나눈 몫만큼 양쪽으로 붙이기 홀수는 중앙에하나
    4. 홀수가 여러개면 sorry

 */
public class Boj1213_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        String str = br.readLine();
        String left = "";
        String right = "";
        String middle = "";
        String rnt = "";
        int check = 0;

        for (int i = 0; i < str.length(); i++) {
            alpha[(int)(str.charAt(i)-65)] += 1;
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i]%2 != 0)
                check++;
        }

        if (check > 1)
            rnt = "I'm Sorry Hansoo";
        else {

            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] != 0) {
                    for (int j = 0; j < alpha[i] / 2; j++) {
                        left = left + (char) (i + 65);
                        right = (char) (i + 65) + right;
                    }
                    alpha[i] %= 2;
                }
            }
            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] == 1) {
                    middle += (char) (i + 65);
                }
            }

            rnt = left + middle + right;
        }

        System.out.println(rnt);
    }
}
