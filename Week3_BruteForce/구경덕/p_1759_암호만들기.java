package week3;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class p_1759_암호만들기 {
    static int[] ch;
    static String[] arr,pm;
    static int n, m;
    static TreeMap<String, Integer> map;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        map = new TreeMap<>();
        m = kb.nextInt();
        n = kb.nextInt();
        arr= new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }
        ch = new int[n]; // 수를 선택했는지 체크
        pm = new String[m]; // 현재 입력된 순열
        DFS(0);
        for(String key : map.keySet()){
            System.out.println(key);
        }
    }

    public static void DFS(int L) {
        if (L == m) { // m개 만큼 수를 뽑았다면 입력된 순열을 출력
            System.out.println(Arrays.toString(pm));
            String s = Arrays.toString(pm);
            if(!map.containsKey(s)){
                map.put(s,1);
            }
        } else { // 아직 덜 뽑았다면 다음 수를 뽑아줌
            for (int i = 0; i < n; i++) {
                // 체크하지 않은, 곧 이전에 뽑지 않은 수만 다음 재귀함수로
                if (ch[i] == 0) {
                    ch[i] = 1; // 뽑았으니 체크
                    pm[L] = arr[i]; // 뽑은 수를 순열에 추가
                    DFS(L + 1); // 다음 수를 뽑으러
                    ch[i] = 0; // 재귀함수가 끝났다면 현재 뽑은 수를 체크해제
                }
            }
        }
    }

}
