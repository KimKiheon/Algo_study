import java.util.Scanner;

public class Boj2559 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int max;
        int cnt = 0;

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < K; i++) {
            cnt += num[i];
        }

        max = cnt;
        int start = 0;
        int end = K;

        while (end <= N-1) {
            cnt -= num[start++];
            cnt += num[end++];
            if (max < cnt) max = cnt;
        }

        System.out.println(max);

    }
}
