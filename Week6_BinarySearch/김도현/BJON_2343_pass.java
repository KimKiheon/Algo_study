package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/2343

import java.util.Scanner;
/*
5 2
1 1 1 1 100
=> 100
 */
class BJON_2343_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 강의 수         1 <= n <= 100_000
        int m = sc.nextInt(); // 블루레이의 개수  1 <= m <= n

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int hap = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = max > arr[i] ? max : arr[i];
            hap += arr[i];
        }

        int left = max;
        int right = hap;

        while (left <= right) {
            int pivot = (left + right) / 2;
            int sum = 0;
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum > pivot) {
                    cnt++;
                    sum = arr[i];
                }
            }
            if (sum <= pivot)
                cnt++;

            if (cnt > m)
                left = pivot + 1;
            else
                right = pivot - 1;
        }
        System.out.println(left);
    }
}