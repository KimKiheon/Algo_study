package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//접근법 재귀함수로 계속 탐색
//1차수정 : 스캐너 입력받는거 nextLine 추가
//2차수정 : 두명 중 가장 큰수 가진사람 순서 출력 추가
//3차수정 : 런타임 에러 인덱스 아웃
public class p_2303_숫자게임 {

    static int[] arr,now;
    static boolean[] visited;
    static int[] maxArr;
    static int[] max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        now = new int[n];
        maxArr = new int[n];
        max = new int[n];
        for(int i = 0; i<now.length;i++){
            max[i] = 0;
            maxArr[i] = 0;
            now[i] = 0;
        }

        for(int i = 0 ;i<n;i++){
            String[] str = br.readLine().split(" ");
            for(int j =0 ;j<5;j++){
                arr[j] = Integer.parseInt(str[j]);
                visited[j] = false;
            }
            calc(0,i);
        }
        int res = max[0];
        int index = 0;


        for(int i =1;i<n;i++){
            if(res < max[i]){
                res = max[i];
                index = i;
            }
            if(res == max[i]){
                res = maxArr[index] > maxArr[i] ? max[index] : max[i];
                index = maxArr[index] > maxArr[i] ? index : i;
            }
        }

        System.out.println(index+1);


    }

    public static void calc(int index,int f){
        if(index == 3){
            int sum = 0;
            for(int x: now){
                sum += x;
//                System.out.print(x+" ");
                if(maxArr[f] < sum){
                    maxArr[f] = sum;
                }
            }
            int temp = sum % 10;
            if(max[f] < temp){
                max[f] = temp;
            }

//            System.out.println("sum : " + sum);

            }else{
            for(int i =0;i<arr.length;i++){
                if(visited[i] == false){
                    visited[i] = true;
                    now[index] = arr[i];
                    calc(index+1,f);
                    visited[i] = false;
                }
            }
        }

    }
}
