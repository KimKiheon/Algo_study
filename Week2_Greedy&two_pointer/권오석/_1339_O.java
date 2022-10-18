import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 단어 수학 - 1339번
 */
public class _1339_O {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        int[] alphabet = new int[26];
        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            for(int j = 0; j < arr[i].length(); j++) {
                alphabet[arr[i].charAt(j) - 'A'] += (Math.pow(10,arr[i].length()-j-1));
            }
        }

        Arrays.sort(alphabet);

        int max = 9;
        int cnt = 26;
        int sum = 0;
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 0) {
                cnt--;
                continue;
            } else {
                sum += alphabet[i] * (max-cnt+1);
                cnt--;
            }
        }
        System.out.println(sum);

//        int[] length = new int[N];
//        for(int i = 0; i < N; i++) {
//            length[i] = arr[i].length();
//        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(length));


    }
}
