package baekjoon_1;
//https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

//  try4 fail
//  이전 문제 : 틀렸습니다.
//  ==> 흠...
public class Main_2108_review {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrNum = new int[N];
        int[] arrResult = new int[4];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arrNum[i] = Integer.parseInt(br.readLine());
            sum += arrNum[i];
        }

        Arrays.sort(arrNum);

        arrResult[0] = (int) Math.round((double) sum / N);  // 평균값
        arrResult[1] = arrNum[N / 2];   //중앙값
        arrResult[3] = arrNum[N - 1] - arrNum[0]; //범위값

        // 최빈값
        int cnt = 0;        // 최빈값이면 1씩 증가
        int max = -1;       // 최빈값 max를 저장하는 변수
        arrResult[2] = arrNum[0];   // 초기화
        boolean check = false;  // 같은 최빈값 경우 다음 최빈값 저장을 위한 변수

        for (int i = 0; i < N - 1; i++) {
            if (arrNum[i] == arrNum[i + 1]) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (cnt > max) {
                max = cnt;
                arrResult[2] = arrNum[i];
                check = true;
            }
            else if (max == cnt && check == true) {
                arrResult[2] = arrNum[i];
                check = false;
            }
        }


        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arrResult.length; i++) {
            bw.write(String.valueOf(arrResult[i]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

//  try3 fail 틀렸습니다.
//  이전 문제 : 메모리초과
//  ==> 최빈값 구하는 공식을 선택정렬? 방식에서 다른 방식으로 수정

//public class Main_2108 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] arrNum = new int[N];
//        int[] arrResult = new int[4];
//        int sum = 0;
//
//        //최빈값 구하기
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int mapMaxIndex = 0;
//        int maxMaxValueCnt = 0;
//        for (int i = 0; i < N; i++) {
//            arrNum[i] = Integer.parseInt(br.readLine());
//            if(arrNum[i] < -4000 ||  4000 < arrNum[i] )
//                return;
//            sum += arrNum[i];
//            map.put(arrNum[i], map.getOrDefault(arrNum[i], 0) + 1);
//            if(map.get(arrNum[i]) > maxMaxValueCnt){
//                mapMaxIndex = arrNum[i];
//                maxMaxValueCnt = map.get(arrNum[0]);
//            }
//        }
//        arrResult[2] = mapMaxIndex;
//
//
//        Arrays.sort(arrNum);
//
//        arrResult[0] = (int) Math.round((double) sum / N);  // 평균값
//        arrResult[1] = arrNum[N / 2];   //중앙값
//        arrResult[3] = arrNum[N - 1] - arrNum[0]; //범위값
//
//
//        // 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < arrResult.length; i++) {
//            bw.write(String.valueOf(arrResult[i]));
//            bw.write("\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}


//  try2 fail 메모리초과
//  이전 문제 : 메모리초과
//  ==> 스캐너 대신 버퍼리더 사용

//public class Main_2108 {
//
//    public static void getResult(int[] arrNum) throws IOException {
//
//        int[] arrResult = new int[4];
//
//        // arrResult[2]
//        int topIndex = 0;
//        int maxCount = 0;
//        int[] arrNumCount = new int[arrNum.length];
//
//        for (int i = 0; i < arrNum.length - 1; i++) {
//            for (int j = i + 1; j < arrNum.length; j++) {
//                if (arrNum[i] == arrNum[j])
//                    arrNumCount[i]++;
//            }
//            if (arrNumCount[i] > maxCount) {
//                topIndex = i;    //인덱스값 저장
//                maxCount = arrNumCount[i];
//            }
//        }
//        arrResult[2] = arrNum[topIndex];
//
//        Arrays.sort(arrNum);
//        arrResult[0] = (int) Math.round((double) Arrays.stream(arrNum).sum() / arrNum.length);
//        arrResult[1] = arrNum[arrNum.length / 2];
//
//        // arrResult[3]
//        if (arrNum.length == 1) // 입력값이 1개인 경우
//            arrResult[3] = 0;
//        else if ((arrNum[0] < 0) && (arrNum[arrNum.length - 1] < 0)) { // 최고값, 최저값 모두 음수인 경우
//            arrResult[3] = Math.abs(arrNum[0]) + arrNum[arrNum.length - 1];
//        } else {  // 최고값, 최저값 중 음수가 있는 경우 or 없는 경우
//            arrResult[3] = Math.abs(arrNum[0]) + Math.abs(arrNum[arrNum.length - 1]);
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < arrResult.length; i++) {
//            bw.write(String.valueOf(arrResult[i]));
//            bw.write("\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] arrNum = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arrNum[i] = Integer.parseInt(br.readLine());
//        }
//        getResult(arrNum);
//        br.close();
//    }
//}

//    // try1 fail 시간 초과
//public class Main_2108 {
//
//    public static void getResult(int[] arrNum) {
//
//        int[] arrResult = new int[4];
//
//        // arrResult[2]
//        int topIndex = 0;
//        int maxCount = 0;
//        int[] arrNumCount = new int[arrNum.length];
//
//        for (int i = 0; i < arrNum.length - 1; i++) {
//            for (int j = i + 1; j < arrNum.length; j++) {
//                if (arrNum[i] == arrNum[j])
//                    arrNumCount[i]++;
//            }
//            if (arrNumCount[i] > maxCount) {
//                topIndex = i;    //인덱스값 저장
//                maxCount = arrNumCount[i];
//            }
//        }
//        arrResult[2] = arrNum[topIndex];
//
//        Arrays.sort(arrNum);
//        arrResult[0] = (int) Math.round((double) Arrays.stream(arrNum).sum() / arrNum.length);
//        arrResult[1] = arrNum[arrNum.length / 2];
//
//        // arrResult[3]
//        if (arrNum.length == 1) // 입력값이 1개인 경우
//            arrResult[3] = 0;
//        else if ((arrNum[0] < 0) && (arrNum[arrNum.length - 1] < 0)) { // 최고값, 최저값 모두 음수인 경우
//            arrResult[3] = Math.abs(arrNum[0]) + arrNum[arrNum.length - 1];
//        } else {  // 최고값, 최저값 중 음수가 있는 경우 or 없는 경우
//            arrResult[3] = Math.abs(arrNum[0]) + Math.abs(arrNum[arrNum.length - 1]);
//        }
//
//        for (int i = 0; i < arrResult.length; i++) {
//            System.out.println(arrResult[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] arrNum = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arrNum[i] = sc.nextInt();
//        }
//        getResult(arrNum);
//    }
//}
