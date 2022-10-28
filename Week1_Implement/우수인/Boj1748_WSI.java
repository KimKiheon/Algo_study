import java.util.Scanner;

public class Boj1748_WSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int digits = 1;
        int div = 10;
        int rnt = 0;
        
        for (int i = 1; i <= N; i++){
            if(i % div == 0){
                digits++;
                div *= 10;
            }
            rnt += digits;
        }

        System.out.println(rnt);
    }
}
