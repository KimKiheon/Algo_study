package Baekjoon_5W_Review;
// https://www.acmicpc.net/problem/1021


import java.io.IOException;
import java.util.*;

class BJON_1021_pass {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] findNum = new int[m];
        for (int i = 0; i < m; i++) {
            findNum[i] = sc.nextInt();
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {  // 큐를 n만큼 초기화 n=10, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            queue.add(i);
        }


        int count = 0;
        for (int j = 0; j < m; j++) {
            int findIndex = queue.indexOf(findNum[j]); //뽑으려 하는 원소 index 로 위치 파악

            // 전체 원소 사이즈/2 를 하여 중간값 기준으로 왼쪽에 있는지, 오른쪽에 있는지 파악 
            if(findIndex <= queue.size()/2 ){ // 중간값 기준 왼쪽에 있을 경우 왼쪽 원소 poll, 오른쪽에 원소를 add
                while(findNum[j] != queue.peek()){
                    queue.addLast(queue.pollFirst());
                    count++;
                }
            }
            else { // 중간값 기준 오른쪽에 있을 경우 오른쪽 원소 poll, 원쪽에 원소를 add
                while(findNum[j] != queue.peek()){
                    queue.addFirst(queue.pollLast());
                    count++;
                }
            }

            if(findNum[j] == queue.peek()){ // 찾으려는 원소가 맞는지 확인 후 poll
                queue.poll();
            }
        }
        System.out.println(count);
    }
}

