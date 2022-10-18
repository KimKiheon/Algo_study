import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 제로 - 10773번
 */
public class s4_10773 {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int idx = 0;
        List<Integer> list1 = new ArrayList<>();

        for(int i = 0; i < K; i++) {

            if(list.get(i) != 0) {
                list1.add(list.get(i));
                idx = list1.size()-1;
            } else {
                list1.remove(idx);
                idx = list1.size()-1;
                if(idx <= 0) idx = 0;
            }

        }

        int sum = 0;
        for(int i : list1) {
            sum += i;
        }

        System.out.println(sum);

    }
}
