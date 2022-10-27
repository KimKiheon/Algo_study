import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16943 {

    static String A;
    static int B;
    static int[] arr;
    static boolean[] check;

    static int answer;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = st.nextToken();
        B = Integer.parseInt(st.nextToken());
        arr = new int[A.length()];
        check = new boolean[A.length()];
        answer = Integer.MIN_VALUE;
        permutation(B,arr,check);

    }

    static void permutation(int target,int[] arr,boolean[] check) {



    }



}