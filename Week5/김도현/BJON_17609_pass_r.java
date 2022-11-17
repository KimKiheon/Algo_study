package Baekjoon_5W_Review;
//https://www.acmicpc.net/problem/17609

//https://furtive-hollyhock-f4c.notion.site/203a4101975e4cf4a43edc9f38bd86b4
/*
aaa -> 0
aab -> 1
baa -> 1
aaba -> 1
aabaa -> 0


1
aabaaba
=> 1


21
abbab
aab
aaab
aaaab
aaaaab
aaaaaab
axaaxaa
abcddadca
aabcbcaa
ababbabaa
abca
babba
sumumuus
XYXYAAYXY
abc
cccfccfcc
abcddcdba
ppbpppb
aabcdeddcba
aabab
aapqbcbqpqaa

1
1
1
1
1
1
1
2
1
1
1
1
1
1
2
1
1
2
2
2
1

 */

import java.io.*;
import java.util.Scanner;

class BJON_17609_pass_r {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            int front = 0;
            int end = word.length() - 1;

            while (front <= end) {
                if (word.charAt(front) == (word.charAt(end))) { //abba 와 같은 완전 회문 검사
                    if(++front > --end)
                        System.out.println(0);
                }
                else{ // 완전 회문 검사에서 틀린 문자가 오면 유사 회문인지 확인하여 맞으면 1을 출력, 아니라면 2를 출력
                    if (checkFrontEnd(word, front + 1, end)) { // 체크할 앞 문자를 1 증가시켜 끝 문자와 비교
                        System.out.println(1);
                    } else if (checkFrontEnd(word, front, end - 1)) { // 체크할 끝 문자를 1감소시켜 앞 문자와 비교
                        System.out.println(1);
                    } else
                        System.out.println(2);  // 유사회문도 아니라면 2를 출력
                    break;
                }
            }
        }
    }

    public static boolean checkFrontEnd(String word, int front, int end) {
        while (front <= end) {
            if (word.charAt(front) == (word.charAt(end))) {
                front++;
                end--;
            } else
                return false;
        }
        return true;
    }
}


// try1 : 런타임 에러
// 정확한 문제 원인을 파악하지 못했지만 예제만 통과하여 성공할 것이라고 생각한 코드가 잘못됐다.
// abbab 이런 예시에서 1이 나와야 하는데 다른 결과값이 나온다.

//class Main_17609 {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            String[] str = sc.next().split("");
//
//            int start = 0;
//            int end = str.length - 1;
//            int result = 0;
//
//            while (start < end) {
//                if (str[start].equals(str[end]) && result < 2) {
//                    start++;
//                    end--;
//                } else if (str[start + 1].equals(str[end]) && result < 2) { // xabba
//                    result++;
//                    start += 2;
//                    end--;
//                } else if (str[start].equals(str[end - 1]) && result < 2) { // abbax
//                    result++;
//                    start++;
//                    end -= 2;
//                }
//                else{   // xabby 같은 경우 출력
//                    System.out.println(2);
//                    break;
//                }
//            }
//            if(start > end) // 끝까지 검사를 했으면 0 or 1 출력
//                System.out.println(result);
//        }
//    }
//}