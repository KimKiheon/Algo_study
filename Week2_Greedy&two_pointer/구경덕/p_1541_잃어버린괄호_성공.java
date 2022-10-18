package week2;

import java.util.Scanner;
//* 접근법
//- 를 기준으로 해서 플러스에 대한 구간을 나눔
//플러스 연산을 다 시행한 후에 빼주면 가장 최소값이 나올것이라 생각

public class p_1541_잃어버린괄호_성공 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();


        String[] str = s.split("-");
        int[] res = new int[str.length];
        for(int i = 0 ; i<str.length;i++){
            res[i] = calc(str[i]);
        }
        for(int i = 1;i<res.length;i++){
            res[0] -= res[i];
        }
        System.out.println(res[0]);

    }

    public static int calc(String s){
        String[] temp = s.split("\\+");
        int res = 0;
        for(String str : temp){
            res += Integer.parseInt(str);
        }
        return res;
    }
}
