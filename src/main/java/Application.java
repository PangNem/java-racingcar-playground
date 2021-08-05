import domain.utils.StringUtils;
import domain.views.InputView;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        String userInputCarNames = InputView.getCarNames();
        List<String> splitCarNames = StringUtils.split(userInputCarNames);
        System.out.println(splitCarNames);

        int tryCount = InputView.getTryCount();
        System.out.println(tryCount);
    }

}
