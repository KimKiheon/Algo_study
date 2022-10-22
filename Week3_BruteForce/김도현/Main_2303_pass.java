package Baekjoon_3_BruteForce;
// https://www.acmicpc.net/problem/2303

import java.io.*;

/*
- 이긴 사람이 두 명 이상일 경우에는 번호가 가장 큰 사람의 번호를 출력한다.!!
=> 여기서 틀린 것 같다. 다시 생각해보자.
=> if( sum > maxvalue) 조건식을 if( sum >= maxvalue) 으로 수정하여 해결!
 */

class Main_2303_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 2 <= N <= 1000
        String[][] arrNum = new String[N][5]; // 각 줄에는 1부터 10사이의 정수가 다섯 개씩 주어진다.
        int maxIndex = 0;
        int maxvalue = -1;
        for (int i = 0; i < N; i++) {
            arrNum[i] = br.readLine().split(" ");
            //System.out.println(Arrays.toString(arrNum[i]));

            for (int f = 0; f < 3; f++) {
                for (int s = f + 1; s < 4; s++) {
                    for (int t = s + 1; t < 5; t++) {
                        int sum = Integer.parseInt(arrNum[i][f]) + Integer.parseInt(arrNum[i][s]) + Integer.parseInt(arrNum[i][t]);
                        sum %= 10;
                        if( sum >= maxvalue){
                            maxvalue = sum;
                            maxIndex = i+1;
                        }
                    }
                }
            }
        }

        bw.write(Integer.toString(maxIndex));
        bw.flush();
        bw.close();
        br.close();
    }
}



// try1 : 틀렸습니다.

//class Main_2303 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine()); // 2 <= N <= 1000
//        String[][] arrNum = new String[N][5]; // 각 줄에는 1부터 10사이의 정수가 다섯 개씩 주어진다.
//        int maxIndex = 0;
//        int maxvalue = -1;
//        for (int i = 0; i < N; i++) {
//            arrNum[i] = br.readLine().split(" ");
//
//
//            for (int f = 0; f < 3; f++) {
//                for (int s = f + 1; s < 4; s++) {
//                    for (int t = s + 1; t < 5; t++) {
//                        int sum = Integer.parseInt(arrNum[i][f]) + Integer.parseInt(arrNum[i][s]) + Integer.parseInt(arrNum[i][t]);
//                        sum %= 10;
//                        if( sum > maxvalue){
//                            maxvalue = sum;
//                            maxIndex = i+1;
//                        }
//                    }
//                }
//            }
//        }
//
//        bw.write(Integer.toString(maxIndex));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}