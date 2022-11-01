package baekjoon_1;
//https://www.acmicpc.net/problem/1629
// 참고 https://st-lab.tistory.com/237

import java.util.Scanner;


// try 4
// 모듈러 성질 : (a * b) % c == ( (a % c) * (b % c) ) % c

public class Main_1629_f {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arrNum = new int[3];

        for (int i = 0; i < 3; i++) {
            arrNum[i] = sc.nextInt();
        }
        if (arrNum[1] == 0) {
            System.out.println(arrNum[0] % arrNum[2]);
        } else {
            long result = 1;
            for (int i = 0; i < arrNum[1]; i++) {
                result *= arrNum[1] % arrNum[2];
            }
            System.out.println(result % arrNum[2]);
        }

    }
}

//  try 3 fail 런타임 시간
//  제곱을 반만 진행하여 시간 단축 했지만.. 변수 범위 : 범위값 초과?

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int[] arrNum = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arrNum[i] = sc.nextInt();
//        }
//
//        long result = 1;
//        for (int i = 0; i < arrNum[1] / 2; i++) {
//            result *= arrNum[0];
//        }
//        result *= result;
//        if (arrNum[1] % 2 != 0)
//            result *= arrNum[0];
//
//        result = result % arrNum[2];
//        System.out.println(result);
//        System.out.println(arrNum[2]-(arrNum[0]%arrNum[2]));
//    }
//}


//    try 2 fail 런타임 에러
//    0으로 나누는 경우? 예외처리가 필요?

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int[] arrNum = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arrNum[i] = sc.nextInt();
//        }
//
//        BigDecimal num = BigDecimal.valueOf(Math.pow(arrNum[0], arrNum[1]));
//        num = num.remainder(BigDecimal.valueOf(arrNum[2]));
//        System.out.print(num);
//    }
//}


//    try 1 fail 틀렸습니다.
//    (최대값 2,147,483,647 입력시 오류가 나는 것 같다.)

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int[] arrNum = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arrNum[i] = sc.nextInt();
//        }
//
//        double num = Math.pow(arrNum[0], arrNum[1]);
//        System.out.print((int) (num % arrNum[2]));
//    }
//}
