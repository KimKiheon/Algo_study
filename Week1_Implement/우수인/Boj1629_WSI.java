import java.util.Scanner;

/**
 * 백준 1629번 곱셈
 *
 * 입력
 * 10 11 12
 *
 * 출력
 * 4
 *
 */
public class Boj1629_WSI {

    public static long C;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long A = in.nextLong();
        long B = in.nextLong();
        C = in.nextLong();

        System.out.println(pow(A, B));
    }

    // A^exponent
    public static long pow(long A, long exponent) {

        // 지수가 1일 경우 A^1 이므로 A를 그대로 리턴
        if(exponent == 1) {
            return A % C;
        }

        // 지수의 절반을 구함
        long temp = pow(A, exponent / 2);

        /*
         * 현재 지수 = 홀수 이면 한번더 곱해줌
         */
        if(exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;

    }

}
