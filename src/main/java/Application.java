import domain.Car;
import domain.RacingGame;
import domain.utils.StringUtils;
import domain.views.InputView;
import domain.views.ResultView;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        String userInputCarNames = InputView.getCarNames();
        List<String> carNames = StringUtils.split(userInputCarNames);
        System.out.println(carNames);

        int tryCount = InputView.getTryCount();
        System.out.println(tryCount);

        List<Car> cars = getCars(carNames);

        RacingGame racingGame = new RacingGame(cars, tryCount);
        racingGame.start();

        int raceCount = 0;
        while (!racingGame.isEnd()) {
            raceCount++;

            racingGame.race(raceCount);
            ResultView.printCurrentCars(cars);

            racingGame.checkGameEnd(raceCount);
        }

        List<String> winners = racingGame.getWinners();
        ResultView.printResult(winners);
    }

    private static List<Car> getCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

}
