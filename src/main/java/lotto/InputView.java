package lotto;

import java.util.Scanner;

public class InputView {
    public static int askBudget() {
        System.out.println("구입금액을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String askWinningNums() {
        System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
