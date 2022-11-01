package Baekjoon_4W_String;

/*
https://www.acmicpc.net/problem/5525
반례 모음 : https://www.acmicpc.net/board/view/88287
 */

import java.io.*;

/*
 try3 :
적용방식 :
 - Brute force 방식이 아닌 KMP 방식을 좀 응용해서 풀어봄2
    1. I를 찾아 IOI단어를 확인하고 맞으면 i+=2 아니면 i+=1.
    2. cnt 를 2씩 늘려가고 맞으면 앞 OI를 뺀다는 개념으로 cnt-2
    3. IOI단어가 아닐 경우 cnt = 1 로 초기화
 */


class Main_5525_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Pn = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        Pn = 2 * Pn + 1;

        int i = 0;
        int result = 0;
        int cnt = 1;
        try {
            while (i < M) {
                if (S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                    cnt += 2;
                    if (cnt == Pn) {
                        result++;
                        cnt -= 2;
                    }
                    i += 2;
                } else {
                    i += 1;
                    cnt = 1;
                }

            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}


///*
// try2 : 틀렸습니다...
// 적용방식 : 이전에 시간 초과가 있어 Brute force 방식이 아닌 KMP 방식을 좀 응용해서 풀어봄
// => Pn을 찾은면 다음 문자열 인덱스 i+2 를 해준다.
// => 찾지 못하면 I 다음으로 찾은 `OI` 갯수 만큼 i를 증가 (OI:2, OIOI:4, OIOIOI:6)
// */
//1
//15
//IOIOIOIOIOIOIOI
//

//class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int Pn = Integer.parseInt(br.readLine());
//        int M = Integer.parseInt(br.readLine());
//        String S = br.readLine();
//
//        Pn = 2 * Pn + 1;
//
//        int i = 0;
//        int result = 0;
//        try {
//            while (i < M) {
//                if (S.charAt(i) == 'I') {
//                    int j = i;
//                    int cnt = 1;
//                    while (S.charAt(j + 1) == 'O' && S.charAt(j + 2) == 'I' && cnt != Pn) {
//                        cnt += 2;
//                        j += 2;
//                    }
//                    if (cnt == Pn) {    // 다음 'OI' 찾기 성공 시 i를 2증가
//                        result++;
//                        i += 2;
//                    } else {   // 다음 'OI' 찾기 실패 시 i를 실패지점까지 증가
//                        i += cnt;
//                    }
//                } else {
//                    i++;
//                }
//
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//
//        }
//
//        bw.write(String.valueOf(result));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}


// try1 : 50점?? 시간초과가 나서 ? => O(N*M)

//class Main_5525 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int Pn = Integer.parseInt(br.readLine());
//        int M = Integer.parseInt(br.readLine());
//        String S = br.readLine();
//
//        Pn = 2 * Pn + 1;
//
//        int i = 0;
//        int result = 0;
//        try {
//            while (i < M) {
//                if (S.charAt(i) == 'I') {
//                    int j = i;
//                    int cnt = 1;
//                    while (S.charAt(j) != S.charAt(j + 1) && cnt != Pn) {
//                        cnt++;
//                        j++;
//                    }
//                    if (cnt == Pn) {
//                        result++;
//                    }
//                }
//                i++;
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//
//        }
//
//        bw.write(String.valueOf(result));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}