package week2;

import java.util.Scanner;

//슬라이딩윈도우
//배열의 끝을 나타내느 표현을 잘 못하겠음.

public class p_2559_수열_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int value =0;
        for(int i = 0 ;i <m;i++) {
            value += arr[i];
        }

        int max = value;
        int i = 0;
        while (m != arr.length){
            value = value - arr[i] + arr[m];
            if(max < value){
                max = value;
            }

            i++;
            m++;
        }
        System.out.println(max);
    }
}
