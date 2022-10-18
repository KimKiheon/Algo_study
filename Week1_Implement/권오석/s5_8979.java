import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 올림픽 - 8979번
 */
public class s5_8979 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] medal = new int[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            medal[i][0] = Integer.parseInt(st1.nextToken());
            medal[i][1] = Integer.parseInt(st1.nextToken());
            medal[i][2] = Integer.parseInt(st1.nextToken());
            medal[i][3] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(medal, (a, b) -> {
            if (a[1] == b[1]) {
                if (a[2] == b[2]) {
                    return b[3] - a[3];
                } else {
                    return b[2] - a[2];
                }

            } else {
                return b[1] - a[1];
            }
        });

        // 키 값을 국가번호, value를 등수
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 1;  // 현재 국가의 등수를 저장
        map.put(medal[0][0],start);

        for (int i = 0; i < N - 1; i++) {
            if (medal[i][1] == medal[i + 1][1] && medal[i][2] == medal[i + 1][2] && medal[i][3] == medal[i + 1][3]) {
                map.put(medal[i+1][0],start);
            } else {
                map.put(medal[i+1][0],i+2);
                start = i+2; //현재 국가의 등수로 바꿔줌
            }
        }

        for(int i : map.keySet()) {
            if(i == K) {
                System.out.println(map.get(i));
            }
        }

    }
}

//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.PriorityQueue;
//        import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        PriorityQueue<nation> que = new PriorityQueue<>((o1, o2) -> {
//            if (o2.gold == o1.gold) {
//                if (o2.silver == o1.silver) {
//                    return o2.bronze - o1.bronze;
//                }
//                return o2.silver - o1.silver;
//            }
//            return o2.gold - o1.gold;
//        });
//
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            int no = Integer.parseInt(st.nextToken());
//            int gold = Integer.parseInt(st.nextToken());
//            int silver = Integer.parseInt(st.nextToken());
//            int bronze = Integer.parseInt(st.nextToken());
//            que.add(new nation(no, gold, silver, bronze));
//        }
//        int rank =1;
//        int same =0;
//        while (!que.isEmpty()) {
//            nation nation = que.poll();
//            if(nation.no==k){
//                System.out.println(rank);
//                return;
//            }
//            if(que.peek().gold==nation.gold&&
//                    que.peek().silver==nation.silver&&
//                    que.peek().bronze==nation.bronze){
//                same++;
//            }else{
//                rank+=same+1;
//                same=0;
//            }
//        }
//    }
//
//    private static class nation {
//        private int no;
//        private int gold;
//        private int silver;
//        private int bronze;
//
//        private nation(int no, int gold, int silver, int bronze) {
//            this.no = no;
//            this.gold = gold;
//            this.silver = silver;
//            this.bronze = bronze;
//        }
//
//    }
//
//}



