import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj16943_WSI {
    private static int max;
    private static ArrayList<Integer> rnt = new ArrayList<>();   //결과값을 담을

    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {

        if (depth == r) {
            String str = "";
            for (int i = 0; i < output.length; i++) {
                str += Integer.toString(output[i]);
            }
            if (max > Integer.parseInt(str) && str.charAt(0) != '0')    //첫 숫자가 0이면 안되고 b보다 작으면 어레이리스트에 삽입
                rnt.add(Integer.parseInt(str));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();    //A,B를 받음
        int N = str.length();   //A의 길이가 C의 길이이므로
        max = Integer.parseInt(st.nextToken()); //B보다 작아야하므로 max값을 B로 설정
        int[] arr = new int[N]; //들어온 A숫자를 받을 배열
        int[] output = new int[N];  //완전탐색 이후 저장할 배열
        boolean[] visited = new boolean[N]; //방문 boolean

        for (int i = 0; i < N; i++) {
            arr[i] = (int)str.charAt(i) - '0' ;
        }

        perm(arr, output, visited, 0, N, N);

        if (rnt.isEmpty())  //조건에 맞는 경우가 없으므로 -1 출력
            System.out.println(-1);
        else
            System.out.println(Collections.max(rnt));   //들어온 값중에 최대값 출력
    }
}
