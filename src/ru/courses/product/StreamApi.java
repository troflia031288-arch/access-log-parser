package ru.courses.product;
import ru.courses.main.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }


}
