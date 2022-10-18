import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 귀여운 라이언 - 15565번
 */
public class _15565_O {
    public static void two_pointer(int N, int K, int[] arr) {

        int left = 0;
        int right = 0;
        int cnt = 0;
        int size = Integer.MAX_VALUE;

        while(right < N) {
            if(cnt < K){
                if(arr[right] == 1){
                    cnt++;
                }
                right++;
            }
            else {
                if(arr[left] == 1) {
                    size = Math.min(size,right-left);
                    cnt--;
                }
                left++;
            }
        }

        while(left < N) {
            if(cnt < K) break;
            if(arr[left] == 1) {
                size = Math.min(size, right - left);
                cnt--;
            }
            left++;

        }

        if(size == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(size);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        two_pointer(N,K,arr);
    }
}
//        int idx = 0;
//        int cnt = 0;
//        int size = Integer.MAX_VALUE;
//        List<Integer> list = new ArrayList<>();
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        while(idx < N) {
//            if(arr[idx] == 1)
//                map.put(idx,arr[idx]);
//            idx++;
//            if(map.size() == 3) {
//                for(int i : map.keySet()) {
//                    list.add(i);
//                }
//                size = Math.min(size,list.get(2) - list.get(0) + 1) ;
//                idx = list.get(1);
//                map.clear();
//                list.clear();
//            }
//        }
//
//        System.out.println(size);


//        while(idx <= N-1) {
//            list.add(arr[idx]);
//            if(arr[idx] == 1) {
//                cnt++;
//            }
//            idx++;
//            if(cnt == K) {
//                size = Math.min(size, list.size());
//                list.remove(list.indexOf(1));
//                idx = idx + list.indexOf(1) + 1;
//                list.clear();
//                cnt = 0;
//            }
//        }
//        System.out.println(size);

//        int cnt = 0;
//        int size = Integer.MAX_VALUE;
//        int end;
//        List<Integer> list = new ArrayList<>();
//
//        for(int start = 0; start <= N-K; start++) {
//            end = start;
//            while(cnt < K && end < N) {
//                list.add(arr[end]);
//                if(arr[end] == 1) {
//                    cnt++;
//                }
//                end++;
//            }
//            if(cnt == K) {
//                size = Math.min(size, list.size());
//            }
//            cnt = 0;
//            list.clear();
//
//        }
//        if(size == Integer.MAX_VALUE)
//            System.out.println(-1);
//        else
//            System.out.println(size);

