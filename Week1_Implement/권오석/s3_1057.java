import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 토너먼트 - 1057번
 */
//public class s3_1057 {
//    public static void main(String[] args) throws Exception{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        int cnt = 0;
//        while (a != b) {
//            a = (a+1) / 2;
//            b = (b+1) / 2;
//            cnt++;
//        }
//        System.out.println(cnt);
//    }
//}
public class s3_1057 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        boolean flag = false;

        while(true) {
            if(Math.abs(a-b) == 1)
                flag = true;
            a /= 2;
            b /= 2;
            cnt += 1;

            if(Math.abs(a-b) == 1 && flag == true) {
                flag = false;
                break;
            }
            else if (a == b) {
                while(a != 0 && b != 0) {
                    a /= 2;
                    b /= 2;
                    cnt += 1;
                }
                break;
            } else {
                a /= 2;
                b /= 2;
                cnt += 1;

                if(a == b && a == 1 && b == 1) {
                    break;
                }

                else if((a == 0 && b != 0) || (b == 0 && a != 0)) {
                    while(a != 0 || b != 0) {
                        a /= 2;
                        b /= 2;
                        cnt += 1;
                    }
                    break;
                }
            }
        }

        if(N == 0) {
            cnt = -1;
        }
        System.out.println(cnt);
    }
}
