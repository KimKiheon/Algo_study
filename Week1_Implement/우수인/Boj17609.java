import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    백준17609번: 회문

    회문: 반대로 읽어도 같을때
    유사회문: 한문자만 삭제하여 회문을 만들 수 있는 문자열

    풀이방법
    1. 시작과 끝을 기준으로 시작은++ 하면서 비교, 끝은 --하면서 비교
    2. 다른 값이 만나면 start == end - 1 / start++ == end 비교 후 없으면 2 출력
    3. 반례 XYXYAAYXY 때문에 왼쪽 짜르는거, 오른쪽 짜르는거 경우 나누어서 품 -> 재귀 or while
 */

/*
    반례 추천
    5	        답
    abcddadca	2
    XYXYAAYXY	1
    ppbpppb	    2
    aabcdeddcba	2
    aabab	    2
 */
public class Boj17609 {
    public int palindrome(String str, int start, int end , int cnt){

        if (cnt == 2) return 2;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                int delS = palindrome(str, start+1, end, cnt+1);
                int delE = palindrome(str, start, end-1, cnt+1);
                cnt = Math.min(delS, delE);
                break;
            }
            start++;
            end--;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Boj17609 main = new Boj17609();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];

        for (int i = 0; i < T; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < T; i++) {
            String s = str[i];
            System.out.println(main.palindrome(s, 0, s.length()-1, 0));
        }
    }
}
