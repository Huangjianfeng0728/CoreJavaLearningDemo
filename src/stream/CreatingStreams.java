package stream;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;



public class CreatingStreams {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("E:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);
        Stream stream1 = Stream.of(content.split(" "));
        Stream stream2 = Stream.generate(()->Math.random());
        Stream stream3 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

    }
}
