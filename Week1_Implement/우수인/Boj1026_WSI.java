import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 1026번: 보물
 *
 * 풀이 고민
 * 1. 배열A는 오름차순 정렬, 배열B는 내림차순 정렬해서 곱하면 제일 최소지 않을까? -> 문제에서 B는 정렬x
 * 2. 배열A를 정렬 후, A의 가장 작은 값과, B의 가장 큰값을 곱해보자 -> ArrayList로 구현 후 꺼낸 값들은 삭제
 */
public class Boj1026_WSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        int N = sc.nextInt();   //길이
//        int[] arrA = new int[N];    //배열A
//        int[] arrB = new int[N];    //배열B

        int[] arrA = new int[N];
        ArrayList<Integer> arrB = new ArrayList<Integer>();

        for (int i = 0; i < N; i++){
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++){
            arrB.add(sc.nextInt());
        }

        Arrays.sort(arrA);

        for (int i = 0; i < N; i++){
            ret += arrA[i]*Collections.max(arrB);
            arrB.remove(Collections.max(arrB));
        }

        System.out.println(ret);
    }
}
