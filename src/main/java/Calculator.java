import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Calculator {

    public int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        IntStream intStream = getIntStream(text);
        if (hasNegative(intStream)) {
            throw new RuntimeException("음수는 허용되지 않습니다.");
        }

        return getIntStream(text).sum();
    }

    private IntStream getIntStream(String text) {
        IntStream tokens = checkIncludeCustomDemeter(text);
        if (tokens != null) {
            return tokens;
        }
        return Arrays.stream(text.split(","))
            .mapToInt(Integer::parseInt);
    }

    private IntStream checkIncludeCustomDemeter(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDemeter = matcher.group(1);
            String[] tokens = matcher.group(2).split(customDemeter);

            return Arrays.stream(tokens)
                .mapToInt(Integer::parseInt);
        }
        return null;
    }

    private boolean hasNegative(IntStream intStream) {
        int negativeCount = (int) intStream.filter(e -> e < 0)
            .count();
        return negativeCount >= 1;
    }


    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
}
