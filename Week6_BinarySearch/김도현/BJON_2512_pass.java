package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/2512

/*
3
100 100 100
30
=> 10

4
1 2 3 4
9
=>3

3
2 2 2
5
=>1

5
4 4 5 5 2
7
answer: 1

3
3 2 4
5
answer: 1

3
4 4 5
6
answer: 2

2
10 20
12
answer : 6

4
101 101 101 101
400
answer : 100

4
4 3 2 1
10
answer : 4

2
10 1
5
answer : 4


10
1 1 1 1 11 11 11 11 11 100
100
=> 41

 */

import java.util.Scanner;

class BJON_2512_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 지방의 수
        int m = sc.nextInt();   // 총 예산

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {   //각 지방의 예산요청
            arr[i] = sc.nextInt();
            max = max > arr[i] ? max : arr[i];
        }

        System.out.println(budget(arr, m, max));

    }

    public static int budget(int[] arr, int m, int max) {
        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int pivout = (left + right) / 2;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (pivout < arr[i])    // 배정 예산이 요청 예산보다 작을 경우 배정예산을 더한다.
                    sum += pivout;
                else                    // 배정 예산이 큰 경우 요청예산을 더한다.
                    sum += arr[i];
            }

            if (m < sum) // 배정 예산의 합이 많은 경우 총예산 보다 많을 경우
                right = pivout - 1;
            else {
                left = pivout + 1;
                result = pivout > result ? pivout : result;
            }
        }
        return result;
    }
}


// try1 : 틀렸습니다.
//class Main_2512 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int hap = 0;
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//            hap += list.get(i);
//        }
//        int m = sc.nextInt();
//
//        Collections.sort(list);
//
//        if(hap < m){
//            System.out.println(Collections.max(list));
//        }
//        else{
//            int aver = m/n;
//            int cnt = 0;
//            int hap2 = 0;
//            for (int i = 0; i < list.size(); i++) {
//                if(aver < list.get(i)){
//                    cnt++;
//                }
//                else{
//                    hap2 +=list.get(i);
//                }
//            }
//            cnt = n - cnt;
//            m -=hap2;
//            if(cnt == 0)
//                System.out.println(m/n);
//            else
//                System.out.println(m/cnt);
//        }
//    }
//}