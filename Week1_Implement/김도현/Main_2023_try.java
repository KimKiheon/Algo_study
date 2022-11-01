package baekjoon_1;
//https://www.acmicpc.net/problem/2023


import java.io.*;

public class Main_2023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;

        start = (int) Math.pow(10, N - 1);    // 1    10      100
        end = (int) Math.pow(10, N);        // 10   100     1000

        if (start != 1)
            start += 1;
        //System.out.printf("\t\tStart : %d, End : %d\n", start, end);

        int i = start;
        int frontNum;
        while (i <= end) {

            if (isPrime(i)) {
                int num = i;
                int check = 1;
                for (int j = 1; j < N; j++) {
                    //divideNum = (int) Math.pow(10, j); // 10 100
                    num = num / 10;
                    if (isPrime(num)) {
                        check = 1;
                        continue;
                    } else {
                        check = -1;
                        break;
                    }
                }
                if (check == 1) {
                    bw.write(String.valueOf(i) + "\n");
                    bw.flush();
                }
            }
            i += 2;
        }

        br.close();
        bw.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        int numSqrt = (int) Math.sqrt(num);
        for (int j = 2; j <= numSqrt; j++) {
            if (num % j == 0)
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