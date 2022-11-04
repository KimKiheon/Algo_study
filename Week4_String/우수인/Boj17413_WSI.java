import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    단어 뒤집기

    풀이방법
    1. 단어 뒤집기
    2. stack 사용해서 풀기
    3. '<' 만나면 flag = true 만들어주고 이전에 stack에 들어있는 것들 출력
    4. flag = false 이면 push, 공백 만나면 pop
 */
public class Boj17413_WSI {

    static Stack<Character> stack = new Stack<>();
    static String cnt;
    static boolean flag = false;

    public static void convert(String str){

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<'){
                flag = true;
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print('<');
            } else if (str.charAt(i) == '>') {
                System.out.print('>');
                flag = false;
            } else if (flag){
                System.out.print(str.charAt(i));
            } else {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(' ');
                } else
                    stack.push(str.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        convert(word);

    }
}
