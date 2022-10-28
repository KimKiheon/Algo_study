import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    백준 1339번

    풀이방법
    1. 기준을 정해보자
    2. 자리수마다 값을 부여하여 계산(10의 제곱수 사용)
 */
public class Boj1339_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] word = new String[N];
        int[] alpha = new int[26];  // A: 65 ~ Z: 90 -> A가 0번째 오려면 받은값 -65

        for (int i = 0; i < N; i++) {
            word[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int power = (int) Math.pow(10, word[i].length()-1);   //자릿수만큼 제곱

            for (int j = 0; j < word[i].length(); j++) {
                int idx = (int)word[i].charAt(j) - 65;  //알파벳 자기 자리 인덱스 찾아가게 -65
                alpha[idx] += power;
                power /= 10;
            }
        }

        Arrays.sort(alpha); //정렬하여 숫자 부여 -> 내림차순 정렬시 Integer배열 사용하면 null값을 초기화 선언해야함(NullPointerException)
        
        int rank = 9;
        int result = 0;

        for (int i = alpha.length-1; i >= 0; i--) {
            if (alpha[i] == 0) break;
            result += rank*alpha[i];
            rank--;
        }
        System.out.println(result);

    }
}
