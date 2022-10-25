package week3;

import java.util.Scanner;

//a가 b보다 크면 어떤수로 배열을 만들던 -1?
// -> 아님 앞에 0자리 붙은건 때야됨
//로직설정 받는 정수1개단위를 받아 string형으로 만듬
// string의 첫째자리가 0이면 0으로 시작하는 수이기떄문에 조건문 추가

//1차수정 : 출력초과로 인한 수정
//2차수정 : 가장 큰값을 반환하지않음

public class p_16943_숫자재배치_성공 {
    static boolean[] visited;
    static int[] arr, now;
    static int m,res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        m = sc.nextInt();
        String temp = Integer.toString(n); //4

        arr = new int[temp.length()];  //4
        now = new int[temp.length()];
        visited = new boolean[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
                arr[i] = temp.charAt(i) - '0';
                visited[i] = false;
        }
        res = -1;


        DFS(0);

        System.out.println(res);

    }
    public static void DFS(int index){
        if(index == arr.length){
            String temp = new String();
            for(int x : now){

                temp = temp+x;
            }

            if(Integer.parseInt(temp) < m && temp.charAt(0) != 48){
                //0 의 아스키코드
                if(res < Integer.parseInt(temp)){
                    res = Integer.parseInt(temp);
                }
            }
        }else {
            // 여기에 체크를 넣었는데..?
                for(int i = 0;i<arr.length;i++){
                    if(visited[i] == false){
                        visited[i] = true;
                        now[index] = arr[i];
                        DFS(index+1);
                        visited[i] = false;
                    }
                }
        }
    }
}
