import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1931 {
    static int N;
    static List<Time> timeList = new ArrayList<>();

    static class Time {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static void timeSort(){
        Collections.sort(timeList, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.end == o2.end){
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });
    }

    static void greedy(){
        int cnt = 0;
        int preEnd = 0;

        for (int i = 0; i < N; i++) {
            Time time = timeList.get(i);

            if (preEnd <= time.start){
                preEnd = time.end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            timeList.add(new Time(start, end));
        }

        timeSort();

        greedy();

    }
}
