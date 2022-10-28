import java.io.*;
import java.util.Arrays;

/*
    백준 11728번

    풀이방법
    1. A배열과 B배열 크기를 합치고 나머지 값들을 추가로 넣기
 */
public class Boj11728_WSI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int arrSize = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
        int[] rnt = new int[arrSize];

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");

        int index = 0;

        for (int i = 0; i < arrA.length; i++){
            rnt[index++] = Integer.parseInt(arrA[i]);
        }
        for (int i = 0; i < arrB.length; i++){
            rnt[index++] = Integer.parseInt(arrB[i]);
        }

        Arrays.sort(rnt);

        for (int i : rnt) {
            bw.write(String.valueOf(i) + " ");
        }

        bw.flush();
        bw.close();


    }
}
