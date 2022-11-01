package Baekjoon_3_BruteForce;


import java.io.*;
import java.util.StringTokenizer;

class Main_14225 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 1 <= N <= 20
        int[] arr = new int[n]; // arr <= 100,000이하의 자연수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nhap = 0;
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            nhap +=arr[i];
        }




        int a= 10;
        System.out.println(a);
        bw.flush();
        bw.close();
        br.close();
    }

}