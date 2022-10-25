package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//1차수정 : 시간초과 : 브루트포스?

public class p_11723_집합 {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int temp = 0;
            if(st.hasMoreTokens()){
                temp = Integer.parseInt(st.nextToken());
            }
            calc(cmd,temp);
        }
    }
    public static void calc(String cmd, int temp){
        switch (cmd){
            case "add":
                if(!set.contains(temp)) {
                    set.add(temp);
                }
                break;
            case "check":
                if(set.contains(temp)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
                break;
            case "remove":
                if(set.contains(temp)){
                   set.remove(temp);
                }
                break;
            case "toggle":
                if(set.contains(temp)){
                    set.remove(temp);
                }else{
                    set.add(temp);
                }
                break;
            case "all":
                set.clear();
                for(int i = 1;i<=20;i++){
                    set.add(i);
                }
                break;
            case "empty":
                set.clear();
                break;
        }
    }
}
