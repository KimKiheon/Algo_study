package baekjoon_1;
//https://www.acmicpc.net/problem/10773

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// pass
// ==> 이전 코드는 K가 최대값이 들어왔을때 인덱값이 오버 됨
public class Main_10773_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[] arrNum = new int[K];
        int indexNum = -1;

        int num;

        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                arrNum[indexNum] = 0;
                indexNum--;
            } else {
                arrNum[++indexNum] = num;
            }
        }
        int hap = 0;
        for (int a : arrNum)
            hap += a;
        System.out.println(hap);
    }
}



// try1 file 틀렸습니다.
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 100000
//	at baekjoon_1.Main_10773.main(Main_10773.java:33)

//public class Main_10773 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //int K = Integer.parseInt(br.readLine());
//        int K = 100000;
//        int[] arrNum = new int[K];
//        int indexNum = 0;
//        int num;
//
//        int[] test = new int[K];
//        for (int i = 0; i < K; i++) {
//            test[i] = i%3;
//        }
//
//
//        for (int i = 0; i < K; i++) {
//            //num = Integer.parseInt(br.readLine());
//            num = test[i];
//            if (num == 0) {
//                arrNum[indexNum] = 0;
//                indexNum--;
//            } else {
//                arrNum[indexNum] = num;
//                indexNum++;
//            }
//        }
//        int hap = 0;
//        for (int a : arrNum)
//            hap += a;
//        System.out.println(hap);
//    }
//}

