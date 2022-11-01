package Baekjoon_3_BruteForce;


import java.io.*;
import java.util.StringTokenizer;

class Main_10972 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int a= 10;
        System.out.println(a);
        bw.flush();
        bw.close();
        br.close();
    }

}