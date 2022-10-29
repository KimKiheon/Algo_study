package Baekjoon_4W_String;
//https://www.acmicpc.net/problem/5052

import java.io.*;
import java.util.Arrays;

class Main_5052_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] phone_book = new String[n];
            for (int j = 0; j < n; j++) {
                phone_book[j] = br.readLine();
            }
            if(solution(phone_book)){
                bw.write("YES\n");
            }
            else
                bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);    // 1. phoneBook을 sorting

        for (int i = 0; i < phone_book.length - 1; i++)  // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        return true;  // 3. 접두어가 없으면 true 리턴
    }
}