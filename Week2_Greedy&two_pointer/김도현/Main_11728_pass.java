package baekjoon_2;
//https://www.acmicpc.net/problem/11728

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// try3 : Pass ! 문제 확인 실수, 중복값이 있으면 제거해야 되는 줄 생각했다.
class Main_11728_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aN = Integer.parseInt(st.nextToken());
        int bM = Integer.parseInt(st.nextToken());
        int[] NM = new int[aN + bM];

        st = new StringTokenizer(br.readLine());
        int i;
        for (i = 0; i < aN; i++) {
            NM[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int j = i; j < aN + bM; j++) {
            NM[j] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(NM);

        for (int num : NM) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}


// try1 : 시간초과 => printf 로 출력을 했는데 버퍼로 출력을 해야 겠다.
// try2 : 틀렸습니다..

//class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int aN = Integer.parseInt(st.nextToken());
//        int bM = Integer.parseInt(st.nextToken());
//
//        HashSet<Integer> hashSet = new HashSet<>();
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < aN; i++) {
//            hashSet.add(Integer.valueOf(st.nextToken()));
//        }
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < bM; i++) {
//            hashSet.add(Integer.valueOf(st.nextToken()));
//        }
//
//        Iterator iter = hashSet.iterator();
//        while(iter.hasNext()) {
//            bw.write(iter.next() + " ");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}