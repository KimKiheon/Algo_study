package Baekjoon_5W_Review;
//https://www.acmicpc.net/problem/2023


import java.io.*;

public class BJON_2023_pass_r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        String[] firstNum = {"2", "3", "5", "7"};  // 첫번째(가장 왼쪽) 자리 숫자 2, 3, 5, 7만 확인
        for (int i = 0; i < firstNum.length; i++) {
            backTracking(firstNum[i], N);
        }
        br.close();
    }

    public static void backTracking(String checkNum, int N) {

        if(N == checkNum.length()){
            System.out.println(checkNum);
            return;
        }

        for (int i = 1; i < 10; i+=2) { // 두번째 자리부터 1, 3, 5, 7, 9만 확인 (1,3,7,9만 확인하면 됨)
            String num = checkNum + i;
            if(isPrime(Integer.parseInt(num))){
                backTracking(num, N);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        int numSqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}


// try1 시간초과

//public class Main_2023 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//
//        int N = Integer.parseInt(br.readLine());
//        int start = 1;
//        int end = 1;
//
//        start = (int) Math.pow(10, N - 1);    // 1    10      100
//        end = (int) Math.pow(10, N);        // 10   100     1000
//
//        if (start != 1)
//            start += 1;
//        //System.out.printf("\t\tStart : %d, End : %d\n", start, end);
//
//        int i = start;
//        int divideNum;
//        while (i <= end) {
//            //System.out.printf("\t\ti : %d\n", i);
//
//            if (isPrime(i)) {
//                int num = i;
//                int check = 1;
//                for (int j = 1; j < N; j++) {
//                    //divideNum = (int) Math.pow(10, j); // 10 100
//                    num = num / 10;
//                    if (isPrime(num)) {
//                        check = 1;
//                        continue;
//                    } else {
//                        check = -1;
//                        break;
//                    }
//                }
//                if (check == 1)
//                    System.out.println(i);
//            }
//            i += 2;
//        }
//
//        br.close();
//        bw.close();
//    }
//
//    public static boolean isPrime(int num) {
//        if (num < 2)
//            return false;
//
//        int numSqrt = (int) Math.sqrt(num);
//        for (int j = 2; j <= numSqrt; j++) {
//            if (num % j == 0)
//                return false;
//        }
//        return true;
//    }
//}