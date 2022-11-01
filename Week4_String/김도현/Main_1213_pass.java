package Baekjoon_4W_String;
//https://www.acmicpc.net/problem/1213

/*
    1. 문자열에 알바벳 수 저장
    2. 알파벳 수가 홀수인 경우 확인, 1을 초과할 경우 "I'm Sorry Hansoo" 출력
    3. 회문 단어 중 앞단어 추출
    4. 앞단어를 반대로 하여 뒷단어 추출
    5. 앞단어 + 홀수 단어 + 뒷단어 출력
 */

import java.io.*;
import java.util.Scanner;

class Main_1213_pass {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {  //1. 배열에 알파벳 수 저장
            alpha[s.charAt(i) - 'A'] += 1;
        }

        int checkOdd = 0;
        String odd = "";
        for (int i = 0; i < 26; i++) { // 2. 알파벳 수가 홀수인 경우 확인
            if(alpha[i]%2 != 0) {
                checkOdd++;
                odd = String.valueOf((char)(i + 'A'));
            }
        }

        String resultFirst = "";
        String resultEnd = "";
        if(checkOdd > 1){ //2. 알파벳 수가 1을 초과할 경우 "I'm Sorry Hansoo" 출력
            System.out.println("I'm Sorry Hansoo");
        }
        else{
            for (int i = 0; i < 26; i++) { // 3. 회문 단어 중 앞단어 추출
                    for (int j = 0; j < alpha[i]/2; j++) {
                        resultFirst += String.valueOf((char)(i + 'A'));
                    }
            }

            for (int i = resultFirst.length()-1; i >=0; i--) { // 4. 앞단어를 반대로 하여 뒷단어 추출
                resultEnd += resultFirst.charAt(i);
            }
            System.out.println(resultFirst+odd+resultEnd); // 5. 앞단어 + 홀수 단어 + 뒷단어 출력
        }
    }
}