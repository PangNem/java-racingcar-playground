import domain.Car;
import domain.Cars;
import domain.InputView;
import domain.ResultView;
import domain.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        System.out.println("Racing Car Application Run!");

        String names = InputView.inputNames();
        int tryCount = InputView.inputTryCount();

        List<Car> carList = Arrays.stream(StringUtils.splitToArray(names))
            .map(Car::new)
            .collect(Collectors.toList());

        Cars cars = new Cars();
        carList.forEach(cars::add);

        System.out.println("실행 결과");
        IntStream.range(0, tryCount).forEach(i -> {
            cars.move();
            ResultView.printCurrentCars(cars);
        });

        try {
            List<Car> winnerCars = cars.getWinnerCars();
            ResultView.printResult(winnerCars);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}