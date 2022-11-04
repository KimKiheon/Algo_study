import java.util.HashMap;
import java.util.Scanner;

public class Boj1620_WSI {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> pocketMap = new HashMap<Integer, String>();
        HashMap<String , Integer> checkMap = new HashMap<String, Integer>();
        int N = input.nextInt();
        int M = input.nextInt();
        String pocketS = "";
        input.nextLine();

        for (int i = 1; i <= N; i++){
            pocketS = input.nextLine();
            pocketMap.put(i, pocketS);
            checkMap.put(pocketS, i);
        }

        for (int i = 0; i < M; i++){
            String s = input.nextLine();
            if((s.charAt(0) - '0') > 0 && (s.charAt(0) - '0') <= 9){
                System.out.println(pocketMap.get(Integer.parseInt(s)));
            }else{
                System.out.println(checkMap.get(s));
            }
        }
    }
}