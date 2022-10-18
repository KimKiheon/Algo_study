import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0 ;
        int lionCnt = 0;
        int min = Integer.MAX_VALUE;

        while (start <= end && end <= N){
            if(lionCnt < K){    //아직 라이언의 갯수가 충족되지 않았을때 start는 고정, end는 ++
                if (end == N)
                    break;
                else if (arr[end] == 1) {
                    lionCnt++;
                }
                end++;
            }
            else {  //라이언의 갯수가 충족되면 min에 값 비교해서 넣어주고 start++ => 다시 라이언을 찾으면 lionCnt를 낮추어 end를 움직이게함
                min = Math.min(min, (end-start));
                if (arr[start] == 1){
                    lionCnt--;
                }
                start++;
            }
        }

        if (min == Integer.MAX_VALUE)
            System.out.println(-1);
        else System.out.println(min);
    }
}
