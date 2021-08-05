import domain.InputView;
import java.util.List;
import utils.StringUtils;

public class Application {

    public static void main(String[] args) {
        String userInputCarNames = InputView.getCarNames();
        List<String> splitCarNames = StringUtils.split(userInputCarNames);
        System.out.println(splitCarNames);

        int tryCount = InputView.getTryCount();
        System.out.println(tryCount);
    }

}
