package org.example.chapter01;

import java.util.Scanner;

public class Z_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름, 점수 입력
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("국어 점수를 입력하세요: ");
        int language = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        int english = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();

        scanner.close();

        // 총점, 평균 계산
        int sum = language + english + math;
        double avg = sum / 3.0;

        // 합격 여부 판정
        String isPass = language >= 60 && english >= 60 && math >= 60 ? "합격" : "불합격";

        // 출력
        System.out.println("[이름: " + name + "]");
        System.out.println("총점: " + sum + "점");
        System.out.println("평균: " + avg);
        System.out.println("판정: " + isPass);

    }
}
