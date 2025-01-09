package step2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3개의 주사위 눈 입력
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        int prize = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            // 같은 눈이 3개일 경우
            prize = 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice1 == dice3) {
            // 같은 눈이 2개일 경우
            prize = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            // 같은 눈이 2개일 경우
            prize = 1000 + dice2 * 100;
        } else {
            // 모두 다른 눈일 경우
            int max = Math.max(dice1, Math.max(dice2, dice3));
            prize = max * 100;
        }

        // 결과 출력
        System.out.println(prize);

        scanner.close();
    }
}