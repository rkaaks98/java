package step2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int hour = scanner.nextInt();

        System.out.print("");
        int minute = scanner.nextInt();

        // 45분 일찍 설정
        minute -= 45;

        // 분이 음수가 되면 한 시간 앞당기고 분을 조정
        if (minute < 0) {
            minute += 60; // 음수 분을 60분으로 보정
            hour -= 1;    // 한 시간 감소
        }

        // 시(hour)가 음수가 되면 23시로 보정
        if (hour < 0) {
            hour = 23;
        }

        System.out.println(+ hour + " " + minute + " ");

        scanner.close();
    }
}
