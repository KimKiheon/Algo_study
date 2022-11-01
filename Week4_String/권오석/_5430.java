import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * AC - 5430번
 * 메모리 - 87764 KB
 * 시간 - 876 ms
 */
public class _5430 {
    static Deque<Integer> deque;
    static StringBuffer sb = new StringBuffer();

    public static void AC(String function) {
        // 뒤집혀 있지 않은 상태를 true
        boolean direction = true;

        for (int i = 0; i < function.length(); i++) {
            char p = function.charAt(i);
            // 뒤집기
            if(p == 'R') {
                direction = !direction;
                continue;
            }
            // 원소 버리기
            else {
                // 비어있으면 error 바로 출력
                if(deque.isEmpty()) {
                    sb.append("error\n");
                    return;
                }
                // 정방향이라면
                if(direction) {
                    // 앞에서 빼기
                    deque.removeFirst();
                }
                // 뒤집혀 있다면
                else {
                    // 뒤에서 빼기
                    deque.removeLast();
                }
            }
        }

//        for(char p : function.toCharArray()) {
//            // 뒤집기
//            if(p == 'R') {
//                direction = !direction;
//                continue;
//            }
//            // 원소 버리기
//            else {
//                // 비어있으면 error 바로 출력
//                if(deque.isEmpty()) {
//                    sb.append("error\n");
//                    return;
//                }
//                // 정방향이라면
//                if(direction) {
//                    // 앞에서 빼기
//                    deque.removeFirst();
//                }
//                // 뒤집혀 있다면
//                else {
//                    // 뒤에서 빼기
//                    deque.removeLast();
//                }
//            }
//        }

        sb.append("[");

        while(!deque.isEmpty()) {
            sb.append(direction ? deque.removeFirst() : deque.removeLast());
            if(deque.size() > 0)
                sb.append(",");
        }
        sb.append("]").append("\n");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String function = br.readLine();
            int n = Integer.parseInt(br.readLine());
            // 구분자 여러개
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            deque = new LinkedList<>();
            while(st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            AC(function);
        }
        System.out.println(sb);
    }
}
