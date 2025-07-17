package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List< Integer > numbers = new ArrayList<>();

        System.out.print("정수를 하나 입력해 주세요: ");
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.print("정수를 입력해 주세요 (" + (i+1) + "/" + N +"): ");
            int numList = sc.nextInt();
            numbers.add(numList);
            for (Integer number: numbers) {
                if(min > number) min = number;
            }
        }

        System.out.println("배열의 최솟값: " + min);

        sc.close();
    }
}
