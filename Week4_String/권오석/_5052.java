import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 전화번호 목록 - 5052번
 */
public class _5052 {

    public static boolean phoneBook(String[] phoneNumber) {
        HashSet<String> hs = new HashSet<>();

        for(String phonenumber : phoneNumber) hs.add(phonenumber);


        for (int i = 0; i < phoneNumber.length; i++) {
            for (int j = 0; j < phoneNumber[i].length(); j++) {
                if(hs.contains(phoneNumber[i].substring(0,j)))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] phoneNumber = new String[n];
            for (int j = 0; j < n; j++) {
                phoneNumber[j] = br.readLine();
            }
            if(phoneBook(phoneNumber) == false) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }

        System.out.print(sb);
    }
}
