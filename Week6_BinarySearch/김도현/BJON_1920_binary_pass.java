package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/1920
/*
5
1 2 3 4 5
5
1 6 2 7 5
 */

import java.util.Arrays;
import java.util.Scanner;

class BJON_1920_binary_pass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        Arrays.sort(arrN);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            int front = 0;
            int end = arrN.length - 1;

            if (binarySearch01(front, end, target, arrN))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static boolean binarySearch01(int front, int end, int target, int[] arrN) {
        int mid;
        while (front <= end) {

            mid = (front + end) / 2;
            if (arrN[mid] == target) {
                return true;
            } else if (arrN[mid] < target) {
                front = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}