import java.io.*;

/*
    IOIOI

    풀이방법
    1. Pn 일때 IOI를 담은 String의 길이는 n*2+1
    2. repeat을 활용해 Pn을 정의
    3. String 길이를 통해 I를 만나면 그 기준으로 substring => indexOutOfBound 생각
    ======== 시간초과 =========
    1. IOI를 갯수를 비교
    2. IOI갯수가 Pn과 동일해지면 => IOI 갯수 = N 이면 전체 결과값 증가하는 로직으로 변경
 */
public class Boj5525_WSI {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String exam = br.readLine();
        int cnt = 0;
        int rnt = 0;

        for (int i = 1; i < M - 1; i++) {
            if (exam.charAt(i-1) == 'I' && exam.charAt(i) == 'O' && exam.charAt(i+1) == 'I') {  //IOI 이면
                cnt++;

                if (cnt == N){  //Pn = IOIOIOI => IOI가 3번 반복 => 이 때는 일치하는 문자열이 한 개 추가
                    rnt++;
                    cnt--;
                }
                i++;    //i가 두칸 전진을 위해
            } else
                cnt = 0;
        }

        bw.write(Integer.toString(rnt));
        bw.flush();
        bw.close();
    }
}
