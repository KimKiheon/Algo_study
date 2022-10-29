import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10773_WSI {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int rnt = 0;

        for (int i = 0; i < K; i++){
            int in = Integer.parseInt(br.readLine());
            if (in == 0){
                stack.pop();
            }else {
                stack.push(in);
            }
        }

        for (Integer integer : stack) {
            rnt += integer;
        }

        System.out.printf("%d", rnt);

    }
}
