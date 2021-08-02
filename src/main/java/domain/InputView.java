package domain;

import java.util.Scanner;

public class InputView {

    public String inputNames() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
