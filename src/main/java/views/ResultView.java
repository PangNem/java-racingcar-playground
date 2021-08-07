package views;

import domain.Car;
import java.util.List;

public class ResultView {

    public static void printCurrentCars(List<Car> cars) {
        cars.forEach(car -> {
            String name = car.getName();
            int position = car.getPosition();

            StringBuffer positionBar = getPositionBar(position);

            System.out.printf("%s : %s \n", name, positionBar);
        });

        System.out.println();
    }

    public static void printResult(List<String> winners) {
        System.out.printf("우승자는 %s 입니다", String.join(",", winners));
    }

    private static StringBuffer getPositionBar(int position) {
        StringBuffer positionBar = new StringBuffer();

        for (int i = 0; i < position; i++) {
            positionBar.append("-");
        }
        return positionBar;
    }
}
