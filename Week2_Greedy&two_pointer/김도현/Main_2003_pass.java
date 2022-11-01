package baekjoon_2;
//https://www.acmicpc.net/problem/2003

/*
- 틀린 이유 찾아내기 (백준 질문 검색을 보며 이유를 찾아 봤다.)
- 이전 코드가 틀린 이유는 아래의 예시를 만족하지 못하는 코드였다.
1 1
1
=> 1

3 3
1 1 3
=> 1
 */

import java.io.*;
import java.util.StringTokenizer;

class Main_2003_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum;
        int end;
        int cnt = 0;
        for (int front = 0; front < N; front++) {
            sum = arr[front];
            end = front + 1;
            while (sum < M && end < N) {
                sum += arr[end++];
            }
            if (sum == M) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}

//  try1 : 틀렸습니다.

//class Main_2003 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine());
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int sum;
//        int end;
//        int cnt = 0;
//        for (int front = 0; front < N - 1; front++) {
//            sum = arr[front];
//            end = front + 1;
//            while (sum < M && end < N) {
//                sum += arr[end++];
//            }
//            if (sum == M) {
//                cnt++;
//            }
//        }
//
//        bw.write(String.valueOf(cnt));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}