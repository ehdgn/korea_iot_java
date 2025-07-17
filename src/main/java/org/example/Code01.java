package org.example;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 개의 숫자를 입력해 주세요: ");
        A = sc.nextInt();
        B = sc.nextInt();

        String message = B == 0 ? "0으로 나눌 수 없습니다." : "A / B = " + ((double)A / (double)B);
        System.out.println(message);

        sc.close();
    }
}
