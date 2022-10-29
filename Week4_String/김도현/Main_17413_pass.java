package Baekjoon_4W_String;
/*
https://www.acmicpc.net/problem/17413

1. 문자열을 입력 받는다.
2. 문자 한개씩 개행 단위까지 문자를 확인 후 다음 개행 단위로 넘어간다.
3. <가 있으면 >이 나올 때까지 출력


 */

import java.io.*;
import java.util.Scanner;

class Main_17413_pass {
    public static void strReversedPrint(String tmp){
        String reversed = new StringBuffer(tmp).reverse().toString();
        System.out.print(reversed);
    }

    public static void strReversedPrintWithSpace(String tmp, char space){
        String reversed = new StringBuffer(tmp).reverse().toString();
        System.out.print(reversed + space);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                strReversedPrint(tmp);
                tmp = "";
                System.out.print(str.charAt(i));
                while (str.charAt(++i) != '>') {
                    System.out.print(str.charAt(i));
                }
                System.out.print('>');
                continue;
            }
            if (str.charAt(i) == ' ') {
                strReversedPrintWithSpace(tmp, ' ');
                tmp = "";
            } else {
                tmp += str.charAt(i);
            }
        }
        strReversedPrint(tmp);
    }
}