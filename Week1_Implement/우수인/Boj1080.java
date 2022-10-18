import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    백준1080번: 행렬

    행렬 변환시 필요한 연산의 횟수 구하기

    풀이방법
    1. 3x3부분만 1 -> 0 / 0 -> 1
    2. 투 포인터로 행과 열 기준을 잡고 3x3이 전체 변했을때 같으면 전진 아니면 -1
    3. 짝수 번째 비교면 원래 행렬 B와 비교, 홀수 번째 비교면 reverse행렬 B와 비교

 */
public class Boj1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];
        int[][] reversB = new int[N][M];

    }
}
