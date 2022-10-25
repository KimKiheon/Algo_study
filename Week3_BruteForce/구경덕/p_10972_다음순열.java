package week3;

//접근법
//DFS를 이용한 전체순열탐색
//배열 비교 방법 Arrays.equals( arr, arr);
//String[] 을 int[] 바꾸는 방법
//비트마스킹, 버퍼리더,라이터

//1차수정 : 시간초과 -> 순열을 비트마스킹으로 풀기
//2차수정 : 시간초과 -> 버퍼리더 수정
//3차수정 : 시간초과 -> String split 제거 StringTokenzer 사용
//4차수정 : 시간초과 ->

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p_10972_다음순열 {
    static int[] arr, pm, nextm;
//    static int[] ch;
    static int m;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        pm = new int[n];
//        ch = new int[n];
        nextm = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            nextm[i] = Integer.parseInt(st.nextToken());
        }

        m = 0;
        permutation(0, 0);
        bw.write("-1");

        bw.flush();
        bw.close();
        br.close();
    }


    private static void permutation(int cnt, int flag) {
        if (cnt == n) {
            if (m == 1) {
                for(int x : pm){
                    System.out.print(x + " ");
                }
                System.exit(0);
            }
            if (Arrays.equals(pm, nextm)) {
                m = 1;
            } // 완성된 순열로 취할 동작
            return;
        }

        for (int i = 0; i < n; i++) {
            if ((flag & 1 << i) != 0) continue;

            pm[cnt] = arr[i]; // cnt자리부터 들어가서 순서가 결정됨
            permutation(cnt + 1, flag | 1 << i); //선택한 인덱스 1로 마킹, 결국 다 111111...이 됨
        }
    }
}

//    public static void DFS(int L) {
//        if (L == n) { // m개 만큼 수를 뽑았다면 입력된 순열을 출력
//            if( m == 1) {
//                System.out.println(Arrays.toString(pm));
//                System.exit(0);
//            }
//            System.out.println(Arrays.toString(pm));
//            if(Arrays.equals(pm,nextm)){
//                m = 1;
//            }
//        } else { // 아직 덜 뽑았다면 다음 수를 뽑아줌
//            int m = nextm[0];
//            for (int i = 0; i < n; i++) {
//                // 체크하지 않은, 곧 이전에 뽑지 않은 수만 다음 재귀함수로
//                if (ch[i] == 0) {
//                    ch[i] = 1; // 뽑았으니 체크
//                    pm[L] = arr[i]; // 뽑은 수를 순열에 추가
//                    DFS(L + 1); // 다음 수를 뽑으러
//                    ch[i] = 0; // 재귀함수가 끝났다면 현재 뽑은 수를 체크해제
//                }
//            }
//        }
//    }
//}
