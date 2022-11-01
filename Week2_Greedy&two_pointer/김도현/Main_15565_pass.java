package baekjoon_2;
//https://www.acmicpc.net/problem/15565

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 자바에서 String 객체는 immutable 하기 때문에,
 += 을 할 때마다 두 문자열의 내용을 완전히 다른 곳에 새로 복사해야 됩니다.
 즉, +=을 n번 수행하는 시간 복잡도는 n^2이나 됩니다.
*/

/*
- 배열로만 풀다 보니 중첩 반복문을 사용하게 되고 시간 복잡도가 증가하여 시간 초과가 된 것 같다.
- 두째 줄에 주어지는 숫자를 전부 저장하는 것이 아닌 필요한 숫자 '1'과 인덱스 번호를 ArrayList에 add하여 데이터를 가공하였다.
- ArrayList.size()를 이용하여 K개 보다 적으면 -1을 return
*/

class Main_15565_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //(1 <=K <= N <= pow(10, 6))
        int K = Integer.parseInt(st.nextToken());

        int num;
        ArrayList<Integer> lion = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for(int n = 0; n <N; n++){
             num = Integer.parseInt(st.nextToken());
             if(num == 1){
                 lion.add(n);
             }
        }
        int min= Integer.MAX_VALUE;
        if (lion.size() < K)
            min = -1;
        else{
            int start = 0;
            int end;
            int len;
            while(start + K -1 < lion.size()){
                end = start + K -1;
                len = lion.get(end) - lion.get(start) + 1;
                if( min > len){
                    min = len;
                }
                start++;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}

// try1 : fail / 시간 초과

//class Main_15565 {
//    static int N;
//    static int K;
//    public static int aaa(String[] arrN, int i) {
//
//        int startIndex = 0;
//        int endIndex = 0;
//        boolean start = false;
//        int Kcnt = 0;
//
//        for (int j = i; j < N; j++) {
//            if (Kcnt == K)
//                return endIndex-startIndex;
//            else if (arrN[j].equals("1") && start) {
//                endIndex = j;
//                Kcnt++;
//            }
//            else if (arrN[j].equals("1") && !start) {
//                startIndex = j;
//                start = true;
//                Kcnt++;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken()); //(1 <=K <= N <= pow(10, 6))
//        K = Integer.parseInt(st.nextToken());
//        String[] arrN = new String[N]; // 1 or 2
//        arrN = br.readLine().split(" ");
//
//        int min= Integer.MAX_VALUE;
//        int len;
//        for(int i = 0; i <= arrN.length-K;i++){
//            if(arrN[i].equals("1")){
//                len = aaa(arrN, i);
//                if(min > len && len != -1){
//                    min = len;
//                }
//            }
//        }
//
//        bw.write(String.valueOf(min));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}