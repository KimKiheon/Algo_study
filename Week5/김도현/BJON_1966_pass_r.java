package Baekjoon_5W_Review;
// https://www.acmicpc.net/problem/1966


import java.io.*;
import java.util.*;

class BJON_1966_pass_r {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>(); // 문서의 중요도를 저장할 큐
            Queue<Integer> indexQueue = new LinkedList<>(); // 초기 인덱스를 저장할 큐

            for (int j = 0; j < n; j++) {
                queue.add(sc.nextInt());    // 문서의 중요도 저장
                indexQueue.add(j);          // 초기 인덱스 저장
            }


            int count = 1;
            while (!queue.isEmpty()) {

                int max = Collections.max(queue); // 중요도 문서 max값, 가장 먼저 인쇄할 문서

                if (max == queue.peek()) { // 먼저 인쇄할 문서이면 poll
                    queue.poll();
                    if (m == indexQueue.poll()) { // 찾으려는 문서인지 인덱스로 확인
                        System.out.println(count);
                        break;
                    }
                    count++;
                } else { // 인쇄할 문서 아니면 맨 뒤에 add
                    queue.add(queue.poll());
                    indexQueue.add(indexQueue.poll());
                }
            }

//            System.out.println(queue);
//            System.out.println(indexQueue);
        }
    }
}

