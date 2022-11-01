package Baekjoon_4W_String;
//https://www.acmicpc.net/problem/1620

/*
    - 데이터를 어떻게 정리할까? 배열?, HashSet?, HashMap?
    - 몬스터 이름이나 번호를 어떻게 판별?  문자열로 받아 문자 하니씩 숫자인지 비교?
    - 출력은 ?
    
    1. 반복문을 통해 몬스터 이름을 입력 받아 배열과 HashMap 에 저장 (숫자일 때 배열로 확인, 문자열일 때 HashMap으로 확인)
    2. 찾는 몬스터가 이름인지 번호인지 확인
    3. 번호라면 index값으로 활용하여 배열에서 데이터 찾아 출력, 문자열이라면 HashMap에서 데이터를 찾아 출력
 */
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Main_1620_pass {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //1. 반복문을 통해 몬스터 이름을 입력 받아 배열과 HashMap 에 저장
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            hashMap.put(s, i+1);
            str[i]= s;
        }

        for (int i = 0; i < m; i++) {
            String tmp = sc.next();

            boolean isNum = true; // 문자열이 숫자인지 문자열인지 확인
            for (int j = 0; j < tmp.length(); j++) {
                if(!Character.isDigit(tmp.charAt(j))){
                    isNum = false;
                    break;
                }
            }

            if(isNum){
                System.out.println(str[Integer.parseInt(tmp)-1]);
            }
            else{
                System.out.println(hashMap.get(tmp));
            }
        }
    }

}