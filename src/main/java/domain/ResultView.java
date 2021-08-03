package domain;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    public static void printResult(List<Car> winnerCars) {
        List<String> winnerList = new ArrayList<>();
        winnerCars.forEach(car -> {
            winnerList.add(car.getName());
        });

        System.out.printf("우승자는 %s 입니다", String.join(",", winnerList));
    }

    public static void printCurrentCars(Cars cars) {
        List<Car> carList = cars.getCars();
        carList.forEach(car -> {
            String name = car.getName();
            int position = car.getPosition();

            StringBuffer positionBar = getPositionBar(position);

            System.out.printf("%s : %s \n", name, positionBar);
        });

        System.out.println();
    }

    private static StringBuffer getPositionBar(int position) {
        StringBuffer positionBar = new StringBuffer();

        for (int i = 0; i < position; i++) {
            positionBar.append("-");
        }
        return positionBar;
    }
}
