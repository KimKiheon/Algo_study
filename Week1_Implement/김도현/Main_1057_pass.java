package baekjoon_1;
//https://www.acmicpc.net/problem/1057

import java.io.*;
import java.util.StringTokenizer;


public class Main_1057_pass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Ap = Integer.parseInt(st.nextToken());
        int Bp = Integer.parseInt(st.nextToken());

        int n = N;
        int count = 0;
        while (Ap != Bp) {
            Ap = Ap % 2 == 0 ? Ap / 2 : Ap / 2 + 1;
            Bp = Bp % 2 == 0 ? Bp / 2 : Bp / 2 + 1;
            count++;
            //System.out.printf("Ap : %d, Bp : %d, Conut :%d\n", Ap, Bp, count);
        }

        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}