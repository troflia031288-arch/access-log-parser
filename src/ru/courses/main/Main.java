package ru.courses.main;
import ru.courses.product.*;

import java.util.stream.Stream;

import static ru.courses.product.StreamApi.getStringFromStream;


public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("This", "is", "my", "new", "friend");
        String result = getStringFromStream(stream);
        System.out.println(result);
    }

}