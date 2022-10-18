import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj1541 {
    public int calc(String str){    //덧셈하는 함수

        int plus = 0;
        String[] s = str.split("\\+");

        for (int i = 0; i < s.length; i++) {
            plus += Integer.parseInt(s[i]);
        }

        return plus;
    }
    public int parse(String[] arr){

        int rnt = 0;

        rnt += calc(arr[0]);    //첫 번째값 넣기

        for (int i = 1; i < arr.length; i++) {
            rnt -= calc(arr[i]);
        }
        return rnt;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boj1541 main = new Boj1541();
        String s = br.readLine();
        String[] arr = s.split("-");

        System.out.println(main.parse(arr));

    }
}
