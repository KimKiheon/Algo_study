package week2;

import java.io.*;
import java.util.Arrays;
//
//접근법
//이중포문 돌리면 시간초과날거같음
//투포인터로 서로 비교해가면서 하나씩 대입하는 방안으로 생각


//소스코드 간결화 필요
//1차 시간초과 -> bufferedreader 수정
//2차 시간초과 -> for문 변경 + continue문 추가
//3차 시간초과 -> 메소드 삭제, if, for 문으로 수정
//4차 수정 -> while문 수정, 로직 다시설계
//5차 수정 -> 인터넷 참고
//* 내가 했던 방식은 최대 3백만 까지의 경우의 수를 봄 * 이것도 가능함!!!
//* 현재코드는 200만 + nlogn 정도의 경우의수를 봄
//* bw 중요성 스트레스;


public class p_11728_배열합치기_성공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input=br.readLine().split(" "); // 첫 번째 개행 읽기
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);

        int[] arr = new int[n];
        int[] brr= new int[m];
        int[] crr = new int[n+m];
        int apoint = 0;
        int bpoint = 0;
        int cnt =  0;

        String[] arrayA=br.readLine().split(" "); // 두 번째 줄 읽기
        String[] arrayB=br.readLine().split(" "); // 세 번째 줄 읽기

        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(arrayA[i]);
        }
        for(int i=0;i<m;i++){
            brr[i] = Integer.parseInt(arrayB[i]);
        }

        while(cnt != crr.length){
            if(brr.length == bpoint){
                crr[cnt] = arr[apoint];
                apoint++;
                cnt++;
                continue;
            }else if(arr.length == apoint){
                crr[cnt] = brr[bpoint];
                bpoint++;
                cnt++;
                continue;
            }

            if(arr[apoint] < brr[bpoint]){
                crr[cnt] = arr[apoint];
                cnt++;
                apoint++;
            }else if(arr[apoint] >= brr[bpoint]){
                crr[cnt] = brr[bpoint];
                cnt++;
                bpoint++;
            }
        }

        for(int i : crr){
            bw.write(String.valueOf(i)+ " ");
        }
        bw.flush();
        bw.close();
    }
}
