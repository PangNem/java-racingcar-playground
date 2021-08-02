import domain.Car;
import domain.InputView;
import domain.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        System.out.println("Racing Car Application Run!");

        InputView inputView = new InputView();
        String names = inputView.inputNames();

        List<Car> cars = Arrays.stream(StringUtils.splitToArray(names))
            .map(Car::new)
            .collect(Collectors.toList());

        int tryCount = inputView.inputTryCount();
        System.out.println(tryCount);
    }
}