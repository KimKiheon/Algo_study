import java.util.Scanner;

public class Boj1057_WSI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int kim = sc.nextInt();
        int im = sc.nextInt();
        int count=0;

        while(kim != im) {
            kim = kim/2 + kim%2;
            im = im/2 + im%2;
            count++;
        }
        System.out.println(count);
    }
}
