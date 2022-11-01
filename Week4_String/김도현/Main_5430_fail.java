package Baekjoon_4W_String;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main_5430_fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String p = sc.next();
            int n = sc.nextInt();
            String[] num = sc.next().split("\\[|,|]");

            ArrayList<String> list = new ArrayList<>();
            for (int j = 1; j <= n; j++) {  // split("\\[|,|]") 을 하면서 앞에 빈데이터가 들어가 있다. 그래서 인덱스 1부터 시작
                list.add(num[j]);
            }

            boolean starOrEnd = true;
            for (int j = 0; j < p.length(); j++) {

                if (p.charAt(j) == 'R') {
                    starOrEnd = !starOrEnd;
                } else if (p.charAt(j) == 'D' && n > 0 && list.size() > 0) {
                    n--;
                    if (starOrEnd) {
                        list.remove(0);
                    } else
                        list.remove(list.size() - 1);
                }
            }
            if (n == 0) {
                System.out.println("error");
                continue;
            }

            String result = "[";
            if (starOrEnd) {
                for (int j = 0; j < list.size(); j++) {
                    result += list.get(j);
                    if (j != list.size() - 1) {
                        result += ",";
                    }
                }
            } else {
                for (int j = list.size() - 1; j >= 0; j--) {
                    result += list.get(j);
                    if (j != 0) {
                        result += ",";
                    }
                }
            }
            result += "]";
            System.out.println(result);
        }
    }
}


// try1 : 시간초과..

//class Main_5430 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            String p = sc.next();
//            int n = sc.nextInt();
//            String[] num = sc.next().split("\\[|,|]");
//
//            ArrayList<String> list = new ArrayList<>();
//            for (int j = 1; j <= n; j++) {  // split("\\[|,|]") 을 하면서 앞에 빈데이터가 들어가 있다. 그래서 인덱스 1부터 시작
//                list.add(num[j]);
//            }
//
//            boolean starOrEnd = true;
//            for (int j = 0; j < p.length(); j++) {
//
//                if (p.charAt(j) == 'R') {
//                    starOrEnd = !starOrEnd;
//                } else if (p.charAt(j) == 'D' && n > 0 && list.size() > 0) {
//                    n--;
//                    if (starOrEnd) {
//                        list.remove(0);
//                    } else
//                        list.remove(list.size() - 1);
//                }
//            }
//            if (n == 0) {
//                System.out.println("error");
//                continue;
//            }
//
//            String result = "[";
//            if (starOrEnd) {
//                for (int j = 0; j < list.size(); j++) {
//                    result += list.get(j) + ",";
//                }
//            } else {
//                for (int j = list.size() - 1; j >= 0; j--) {
//                    result += list.get(j) + ",";
//                }
//            }
//            result = result.replaceAll(",$", "]");
//            System.out.println(result);
//        }
//    }
//}