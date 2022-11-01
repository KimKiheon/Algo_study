package baekjoon_1;
//https://www.acmicpc.net/problem/1026

import java.util.Arrays;
import java.util.Scanner;

// try 2 pass

public class Main_1026_pass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        int hap = 0;

        for(int i = 0; i < N; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for(int i = 0; i < N; i++){
            hap += arrA[i] * arrB[N-i-1];
        }
        System.out.println(hap);
    }
}

// try 1 런타임 에러 (NoSuchElement)

//public class Main {
//
//    public static int[] getNum(int N,int[] arr){
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < N; i++){ //N만큼 배열에 스캔
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr); // 오름차순 정렬
//        return arr;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] arrA = new int[N];
//        int[] arrB = new int[N];
//        int hap = 0;
//
//        arrA = getNum(N, arrA);
//        arrB = getNum(N, arrB);
//
//        for(int i = 0; i < N; i++){
//            hap += arrA[i] * arrB[N-i-1];
//        }
//        System.out.println(hap);
//    }
//}

