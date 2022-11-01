import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 단어 뒤집기 2 - 17413번
 */
public class _17413 {

    static String str;
    static StringBuffer sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        sb = new StringBuffer();

        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        // 괄호 안에 들어오면 true
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                flag = true;
                while (!stack.empty()) sb.append(stack.pop());

                sb.append(str.charAt(i));
                continue;
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            //
            if (!flag) {
                if (str.charAt(i) == ' ') {
                    while(!stack.empty()) sb.append(stack.pop());
                    sb.append(str.charAt(i));
                    continue;
                }
                stack.push(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        while(!stack.isEmpty()) sb.append(stack.pop());

        return sb.toString();
    }
}

