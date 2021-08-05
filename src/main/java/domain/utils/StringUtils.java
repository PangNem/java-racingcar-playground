package domain.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<String> split(String carNames) {
        return Arrays.stream(carNames.split(","))
            .collect(Collectors.toList());
    }
}
