package Baekjoon_4W_String;
/*
문제 : https://www.acmicpc.net/problem/1439

char => int 변환
https://frhyme.github.io/java/java_basic02_char_to_int/


* S의 길이는 100만보다 작다.
* 최소 횟수를 출력
* 1111 처럼 문자열이 한가지 문자로만 이루어져 있다면 0
* 11001100110011000001 의 경우 4
=> 연속되는 똑같은 문자 기준으로 101010101 이 된다. '0'은 4개 '1'은 5개 이므로 0을 기준으로 문자를 뒤집는다.


1. S를 입력 받는다.
2. 반복되는 똑같은 문자열을 한 문자로 줄인다.
ex) 0001100  => 010  => '0'이 2개, '1'이 1개. => 답은 1
3. `0`과 `1`의 갯수를 구한다.
4. 적은 갯수를 출력
5. 1111 와 같은 경우 예외처리 출력

 */

import java.io.*;


class Main_1439_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int one = 0;
        int zero = 0;
        int[] arr = new int[s.length()];

        int i = 0;
        try {
            while (i < s.length()) {
                if (s.charAt(i) == '0') {
                    zero++;
                    while (s.charAt(i) == '0') {
                        i++;
                        //System.out.printf("\t0 갯수 : %d   s : %c\n", one, s.charAt(i));
                    }
                } else {
                    one++;
                    while (s.charAt(i) == '1') {
                        i++;
                        //System.out.printf("\t1 갯수 : %d   s : %c\n", zero, s.charAt(i));
                    }
                }
            }
        }catch (StringIndexOutOfBoundsException e){

        }

        //System.out.printf("zero : %d개, one : %d개", zero, one);

        int result = zero > one ? one : zero;
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}