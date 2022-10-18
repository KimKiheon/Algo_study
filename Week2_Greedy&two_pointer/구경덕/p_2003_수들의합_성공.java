package week2;

import java.util.Arrays;
import java.util.Scanner;
//
//접근법
//투포인터
//1차 수정 : arr[0] = m  일때 추가
//2차 수정 : 문제풀다 자연수의 범위를 망각함
//3차 수정 : 전체 탐색 추가(반복문 탈출 조건문 만듬)
//4차 수정 : 런타임에러 발생-> 소스코드 전체 수정
//5차 수정 : 배열 그 합산이 기준보다 크거나 같거나 작거나에 따라서 포인터를 움직이는 방향으로 해결

public class p_2003_수들의합_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int st = 0;
        int end = 0;
        int value = arr[st];
        int cnt = 0;
        int t = 0;
        while (st != arr.length) {
            System.out.printf("%d회차\n", t++);
            System.out.println("st : " + st);
            System.out.println("end : " + end);
            System.out.println("value : " + value);
            System.out.println("cnt : " + cnt);
            System.out.println(Arrays.toString(arr));
            System.out.println("---------------");

            if (value < m || st == end) {
                if(value == m){
                    cnt++;
                }

                if(end == arr.length-1){
                    value -= arr[st];
                    st++;
                }else {
                    end++;
                    value += arr[end];
                }
            } else if (value == m) {
                cnt++;
                value -= arr[st];
                st++;
            } else {
                value -= arr[st];
                st++;
            }
        }
        System.out.println(cnt);

    }
}

