package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/1072


import java.util.Scanner;

/*
53 47 => 2
1000000	999990 => -1


-! double 로 계산 시 정확한 값이 아니라 근사값이 나올 수 있다.
//        // double 근사값 test
//        double a = 100;
//        double b = 100;
//        for (int i = 1; i <= a; i++) {
//            System.out.println((i/b)*100);
//        }
=> 그래서 승률을 계산할때 정수형으로 계산함

- 1000000	999990 와 같은 예제에서는 마지막까지 검사를 하여도 결과가 바뀌지 않는다. (-1)
=>
 */
class BJON_1072_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int win = sc.nextInt();


        if (total == win)
            System.out.println(-1);
        else {
            int left = 0;
            int right = 1_000_000_000;
            int fristWinRate = winRate(total, win);

            int result = -1;
            while (left <= right) {
                int pivot = (left + right) / 2;
                int mid = winRate(total + pivot, win + pivot);

                if (fristWinRate != mid) { // 변하면 더 작은 수로 체크
                    right = pivot - 1;
                    result = pivot;
                } else { // 변하지 않으면 left수를 증가시켜 pivot값을 높인다.
                    left = pivot + 1;
                }
            }
            System.out.println(result);
        }
    }

    public static int winRate(long total, long win) {
        return (int) (win * 100 / total);
    }

}