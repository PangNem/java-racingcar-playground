package domain;

import java.util.Scanner;

public class InputView {

    public static String inputNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return getInputString();
    }

    public static int inputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return toInts(getInputString());
    }

    private static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int toInts(String inputString) {
        return Integer.parseInt(inputString);
    }
}
