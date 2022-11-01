package Baekjoon_3_BruteForce;


import java.io.*;
import java.util.*;

/*
2000 1000
=> -1
위의 예제를 들었을 때 원하는 결과값이 안나옴..

123 123
=> -1
위의 예제도 제대로 안나옴..

1234 4100
=>3421
이것도.. 새 코드를 작성해야겠다.

 */

class Main_16943_f {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");

        Arrays.sort(a, Collections.reverseOrder()); // 내림차순

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            arr.add(Integer.parseInt(a[i]));
        }

        String C = "";
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(j) <= Integer.parseInt(b[i])) {
                        System.out.printf("arr[%d] : %d, b[%d] : %s\n", j, arr.get(j), i,b[i]);
                        C += arr.get(j);
                        //System.out.println(arr);
                        arr.remove(j);
                        //System.out.println(arr);
                        break;
                    }
                }
            }
        }

        if(C.equals("") || C.charAt(0) == '0'){ //ex) 1000 5 => 반복문을 돌지 않아 C=="", 789 123 => 큰닶이 없어서 C==""
            bw.write("-1");
        }
        else
            bw.write(C);

        bw.flush();
        bw.close();
        br.close();
    }
}


/*
2000 1000
=> 000
위의 예제를 들었을 때 원하는 결과값이 안나옴..

try2 : 틀렸습니다..
위의 예제의 결과값은 -1이다. 생각을 잘못했다..
 */

//class Main_16943 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        String[] a = st.nextToken().split("");
//        String[] b = st.nextToken().split("");
//
//        Arrays.sort(a, Collections.reverseOrder()); // 내림차순
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            arr.add(Integer.parseInt(a[i]));
//        }
//
//        String C = "";
//        if (a.length != b.length) {
//            bw.write("-1");
//            bw.flush();
//            bw.close();
//            br.close();
//            return;
//        } else {
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < arr.size(); j++) {
//                    if (arr.get(j) <= Integer.parseInt(b[i])) {
//                        System.out.printf("arr[%d] : %d, b[%d] : %s\n", j, arr.get(j), i,b[i]);
//                        C += arr.get(j);
//                        System.out.println(arr);
//                        arr.remove(j);
//                        System.out.println(arr);
//                        break;
//                    }
//                }
//                if(C.equals("0")){
//                    C = String.valueOf(arr.get(i));
//                }
//            }
//        }
//
//        if(C.equals("")){
//            bw.write("-1");
//        }
//        else
//            bw.write(C);
//
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}




// try1 : 틀렸습니다.

//class Main_16943 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        String[] a = st.nextToken().split("");
//        String[] b = st.nextToken().split("");
//
//        Arrays.sort(a, Collections.reverseOrder()); // 내림차순
//
//        int[] arr = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            arr[i] = Integer.parseInt(a[i]);
//        }
//
//        String C = "";
//        if (a.length != b.length) {
//            bw.write("-1");
//            bw.flush();
//            bw.close();
//            br.close();
//            return;
//        } else {
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a.length; j++) {
//                    if (arr[j] <= Integer.parseInt(b[i]) && arr[j] != -1) {
//                        C += arr[j];
//                        arr[j] = -1;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if(C.equals("")){
//            bw.write("-1");
//        }
//        else
//            bw.write(C);
//
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}