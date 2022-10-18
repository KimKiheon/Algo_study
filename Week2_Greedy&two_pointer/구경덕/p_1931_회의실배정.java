package week2;

import java.util.*;

//가장 짧은 시간의 대역을 선택한다

class Ref implements Comparable<Ref> {
    int start;
    int end;
    public Ref(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Ref o) {
        return this.start-o.start;
    }
}


public class p_1931_회의실배정 {
    static ArrayList<Ref> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i<n;i++){
            int st = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Ref(st,end));;
        }
        Collections.sort(list);


    }
}
