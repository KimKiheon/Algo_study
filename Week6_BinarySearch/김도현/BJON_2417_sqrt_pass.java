package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/2417

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BJON_2417_sqrt_pass {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        long sqrtNum = (long) Math.sqrt(num);

        if (sqrtNum * sqrtNum < num)
            System.out.println(sqrtNum + 1);
        else
            System.out.println(sqrtNum);
    }
}