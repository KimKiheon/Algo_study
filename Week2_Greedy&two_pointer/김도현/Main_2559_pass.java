package baekjoon_2;
//https://www.acmicpc.net/problem/2559

import java.io.*;
import java.util.StringTokenizer;


class Main_2559_pass {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 날짜의 수 (2 <= N < 100,000)
        int K = Integer.parseInt(st.nextToken());   // 연속적인 날짜의 수 (K = 1과 N 사이의 정수)
        arr = new int[N]; // 연속적인 온도 저장 변수 (-100 <= arr <= 100 )

        st = new StringTokenizer(br.readLine());
        int max = -101;
        for (int i = 0; i < N; i++) {   // // 연속적인 온도 저장
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max)
                max = i;
        }

        int first = 0;
        int end = K - 1;
        int maxSum = Integer.MIN_VALUE;
        int sum;
        while (end < N) {
            sum = sum(first, end);
            //System.out.printf("first : %d, next : %d, maxSum : %d\n", first, end, maxSum);
            if (sum > maxSum) {
                maxSum = sum;
            }
            first++;
            end++;

        }
        bw.write(String.valueOf(maxSum));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int sum(int first, int end) {
        int sum = 0;
        for (int i = first; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}