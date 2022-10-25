package week3;

import java.util.Scanner;

public class p_2529_부등호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");

    }

    public static void calc(){

    }
    public static boolean isTrue(int a,int b,String c){
        boolean TF = false;
        if(c.equals("<")){
            TF = a < b ?  true : false;
        }
        else if(c.equals(">")){
            TF = a > b ? true : false;
        }
        return TF;
    }
}
