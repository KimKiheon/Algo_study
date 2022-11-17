package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/16401


import java.util.Scanner;

/*
4 2
10 11
=> 5

5 3
2 5 10
=> 2

6 6
5 5 5 4 5 7
=> 4

4 10
9 10 120 40 55 12 40 50 60 10
=> 55

모든 조카에게 나눠줄 수 없으면 0 / 런타임 에러 by zero
10  3
1 1 1
=> 0
 */

// 정렬을 사용하면 시간 초과가 된다.
// => 과자를 정렬하는 것이 아니다.
// => 이분탐색에서 정렬 할 데이터는 pivot값 기준으로 사용할 데이터가 정렬되어 있으면 된다.

// 나누어 줄 수 없을때 예외처리 ! pivot 값 계산에서 <런타임 에러 by zero> 발생했다.
// => 초기 left 값을 0을 초기화하면 0까지 pivot을 계산하는데 사용된다.
// => 이분탐색에서  pivot값 기준으로 사용할 데이터에 0이 없도록 하자
class BJON_16401_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nephewM = sc.nextInt();
        int snackN = sc.nextInt();

        int[] arr = new int[snackN];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < snackN; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(binarySearch01(1, max, nephewM, arr));

    }

    public static int binarySearch01(int left, int right, int M, int[] arr) {

        int result = 0;
        while (left <= right) {
            int pivot = (left + right) / 2;
            int cnt = 0;


            for (int i = arr.length - 1; i >= 0; i--) {
                cnt += arr[i] / pivot;
                if (cnt >= M)
                    break;
            }

            if (cnt >= M) {
                result = pivot;
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return result;
    }
}