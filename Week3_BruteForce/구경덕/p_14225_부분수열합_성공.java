package week3;

import java.util.*;

//접근법
//부분수열 구하는 법 -> DFS 구현
//map에 넣어서 키값이 있는지 없는지 판단
//cnt 변수로 map 안 키값과 하나씩 비교해서 값이 다를경우 출력 후 프로그램종료
//만약 출력하지 못했을 경우 cnt++ 한 값을 출력

//1차수정 : 시간초과 -> 순열에서 조합으로 변경
//2차수정 : hsahset은 순서 상관없이 저장해서 iterator로 표현했을 시 에러 가능성있음
//트리맵으로 수정

public class p_14225_부분수열합_성공 {

    static int n;
    static TreeMap<Integer, Integer> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr= new int[n];
        boolean[] visited = new boolean[n];

        map = new TreeMap<>();
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1;i<=n;i++){
            comb(arr,visited,0,n,i);
        }
        int cnt = 1;
        for(Integer key : map.keySet()){

            if(cnt != key){
                System.out.println(cnt);
                System.exit(0);
            }
            cnt++;
        }

        System.out.println(cnt);
    }
    static void comb(int[] arr, boolean[] visited, int depth, int n,int r){
        if(r == 0){
            int res = 0;
            for(int i =0;i<n;i++){
                if(visited[i]){
                    res += arr[i];
                }
            }
            if(!map.containsKey(res)){
                map.put(res,1);
            }
            return;
        }
        if(depth == n){
            return;
        }

        visited[depth] = true;
        comb(arr,visited,depth+1,n,r-1);
        visited[depth] = false;
        comb(arr,visited, depth+1, n ,r);

    }
}
