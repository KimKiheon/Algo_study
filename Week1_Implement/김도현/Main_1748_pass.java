package baekjoon_1;
//https://www.acmicpc.net/problem/1748

import java.util.Scanner;


// try 2 pass
// 이전 문제 : 메모리초과
// ==> 숫자를 문자열로 만들어 문자열 길이를 구하는 방식을 바꾸어 메모리 문제 해결
// ==> 주어진 숫자까지 반복문을 통해 1의 자리(+1), 10의 자리(+2), 100의 자리(+3) 인경우 카운트를 달리하여 계산함

public class Main_1748_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 정수 입력값
        int result = 0; // 결과값 (길이의 합)
        int cnt = 1;    // 자리별 카운트 단위 (1의 자리인 경우 1, 10의 자리인 경우 2, 100의 자리인 경우 3...)
        int nPlace = 10; // 자리값 증가를 위한 변수 (1의 자리 * 10, 10의 자리 * 10)

        for (int i = 1; i <= num; i++) {
            if (i < nPlace)
                result += cnt;
            else {
                cnt++;
                nPlace *= 10;
                result += cnt;
            }
        }
        System.out.println(result);

//        문자열로 간단한 결과값 확인
//        String s = "";
//        for (int i = 1; i <= num; i++) {
//            s += String.valueOf(i);
//        }
//        System.out.println("RResult : " + s.length());

    }
}


//    try 1 fail
//    메모리초과 : 정수를 문자열로 저장하여 길이를 구하는 방식에서 메모리 초과

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int Num = sc.nextInt();
//        String result ="";
//        for (int i = 1; i <= Num; i++) {
//            result += i;
//        }
//
//        System.out.println(result.length());
//    }
//}
