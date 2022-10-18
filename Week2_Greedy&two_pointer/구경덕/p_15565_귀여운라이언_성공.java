package week2;


import java.util.Scanner;
//
//접근법
//투포인터로 찾는다
//값 변경 감지 방법 ->

//소스를 좀더 간결하게 할 수 없을까?

public class p_15565_귀여운라이언_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        int st=0;
        int end=0;
        int check = 0;
        int min_lang = Integer.MAX_VALUE;

        if(arr[0] == 1){
            check += 1;
        }

        while(end != arr.length){
            if(check < k){
                if(st == arr.length-1){
                    break;
                }else {
                    st++;
                    if (arr[st] == 1) {
                        check += 1;
                    }
                }
            }else if( check == k ){
                int flag = 0;
                if(st - end < min_lang){
                    min_lang = st- end +1;
                }
                if(arr[end] == 1){
                    flag = 1;
                }
                end++;
                check -= flag;
            }
        }
        if(min_lang == Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(min_lang);
        }


    }
}
