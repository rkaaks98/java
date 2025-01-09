package step2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄: 현재 시각 입력 (시, 분)
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        // 둘째 줄: 요리 시간 입력 (분)
        int cookingTime = scanner.nextInt();

        // 현재 시간에 조리 시간을 더하기
        int totalMinutes = currentHour * 60 + currentMinute + cookingTime;

        // 최종 시각 계산
        int endHour = (totalMinutes / 60) % 24; // 24시간제 처리
        int endMinute = totalMinutes % 60;

        // 결과 출력
        System.out.println(endHour + " " + endMinute);

        scanner.close();
    }
}
