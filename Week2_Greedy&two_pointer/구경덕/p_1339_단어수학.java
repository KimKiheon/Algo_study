package week2;


import java.util.Scanner;

//접근법
// 최대값이 나오려면 각 배열 별로 가장 큰수부터 큰 값을 가지고 있으면 된다.
// 자릿수가 같고 더 많은 것을 체킹 =>
//반례


//가중치로 풀었다. -> 9~0 까지의 숫자들 정리 (Map, 또는 배열 사용)
public class p_1339_단어수학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }
        int std = 7;
        for(int i = 0;i<7;i++){
            System.out.println("str" + str[i]);
            System.out.println("std" + std);
            if(isCheck(str[i],std)){
                char c = str[i].charAt(std);
                System.out.println(c);
            }
            std--;
        }

    }
    public static boolean isCheck(String str, int std){
        if(str.length() == std){
            return true;
        }
        return false;
    }
}
