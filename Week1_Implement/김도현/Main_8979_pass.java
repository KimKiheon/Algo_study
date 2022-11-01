package baekjoon_1;
//https://www.acmicpc.net/problem/8979
// Tokenizer 사용법 https://jhnyang.tistory.com/398

import java.io.*;
import java.util.StringTokenizer;

public class Main_8979_pass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int countryNum = Integer.parseInt(st.nextToken());
        int findCountry = Integer.parseInt(st.nextToken());

        int arr[][] = new int[countryNum][5];
        int indexFindCountry = 0;
        for (int i = 0; i < countryNum; i++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            if (findCountry == country)
                indexFindCountry = i;
            arr[i][0] = country;
            arr[i][1] = gold;
            arr[i][2] = silver;
            arr[i][3] = bronze;
        }

        int rank = 1;
        for (int i = 0; i < countryNum; i++) {
            if (i == indexFindCountry)
                continue;
            else {
                if (arr[i][1] > arr[indexFindCountry][1]) // compare gold
                    rank++;
                else if ((arr[i][1] == arr[indexFindCountry][1]) && (arr[i][2] > arr[indexFindCountry][2])) // same gold, compare silver
                    rank++;
                else if ((arr[i][1] == arr[indexFindCountry][1]) && (arr[i][2] == arr[indexFindCountry][2])
                        && (arr[i][3] > arr[indexFindCountry][3]))
                    rank++;
            }
        }
        bw.write(String.valueOf(rank));
        bw.flush();

        br.close();
        bw.close();

    }
}