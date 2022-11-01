package baekjoon_2;
//https://www.acmicpc.net/problem/1541

import java.io.*;

class Main_1541_pass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numLine = br.readLine();

        String[] num = new String[25];

        num = numLine.split("-");
//        55+50-40+55-50+40
//        System.out.println(num.length);
//        System.out.println(Arrays.toString(num));

        for(int i = 0; i < num.length; i++){
            num[i] = String.valueOf(ssum(num[i]));
        }

        int hap = Integer.parseInt(num[0]);
        for(int i = 1; i < num.length; i++){
            hap -= Integer.parseInt(num[i]);
        }

//        System.out.println(Arrays.toString(num));
//        System.out.println(hap);

        bw.write(Integer.toString(hap));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int ssum(String num){

        String[] tmp = num.split("\\+");
        int sum = 0;
        for (String number : tmp){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}