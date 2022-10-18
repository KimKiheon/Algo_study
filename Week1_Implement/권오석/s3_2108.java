import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 통계학 - 2108번
 */
public class s3_2108 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }
        double mean = sum / N;

        //산술평균
        System.out.println(Math.round(mean));

        //오름차순 정렬
        Arrays.sort(arr);

        // 중앙값
        int mid = N / 2;
        System.out.println(arr[mid]);

        //최빈값
        HashMap<Integer, Integer> map = new HashMap<>();
        //최빈값이 여러개일 경우의 최빈값 저장 리스트
        ArrayList<Integer> list = new ArrayList<>();

        // 키인 i가 이미 존재한다면 그 값을 가져오고, 아니면 defaultValue 대입
        for(int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(int value : map.values()) {
            max = Math.max(max,value);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            if((int)entry.getValue() == max) {
                list.add((int)entry.getKey());
            }
        }

        Collections.sort(list);
        if(list.size() == 1) System.out.println(list.get(0));
        else System.out.println(list.get(1));

        System.out.println(arr[N - 1] - arr[0]);

    }
}


//        boolean flag = true; //최빈값이 첫번째이면 false 두번째이면 true
//        int mod = arr[0]; //최빈값(정수가 한개일 땐 그 즉시 최빈값)
//        int max = Integer.MIN_VALUE; //최빈값 빈도의 최댓값
//        int cnt = 0; //최빈값이 몇번 등장하는지
//
//        for(int i = 0; i < N-1; i++) {
//            if(arr[i] == arr[i+1]) {
//                cnt++;
//            } else {
//                cnt = 0;
//            }
//
//            if(max < cnt) {
//                max = cnt;
//                mod = arr[i];
//                flag = false;
//            } else if(max == cnt && flag == false) {
//                mod = arr[i];
//                flag = true;
//            }
//        }
//
//        System.out.println(mod);

        //범위

