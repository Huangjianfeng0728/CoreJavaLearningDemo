package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicTypeStream {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4);
        Stream<Integer> integerStream = intStream.boxed();

        Stream<String> stringStream = Stream.of("huang","jian", "feng");
        System.out.println(stringStream.mapToInt(String::length).sum());

    }
}
