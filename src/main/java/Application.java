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

        int tryCount = InputView.getTryCount();

        List<Car> cars = getCars(carNames);

        RacingGame racingGame = new RacingGame(cars, tryCount);
        racingGame.start();

        int raceCount = 0;
        while (!racingGame.isEnd()) {
            raceCount++;

            race(racingGame);
            ResultView.printCurrentCars(cars);

            racingGame.checkGameEnd(raceCount);
        }

        List<String> winners = racingGame.getWinners();
        ResultView.printResult(winners);
    }

    private static void race(RacingGame racingGame) {
        try {
            racingGame.race();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static List<Car> getCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

}
