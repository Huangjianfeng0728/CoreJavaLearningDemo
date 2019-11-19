package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("E:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);

        //System.out.println(content);
        List<String> words = Arrays.asList(content.split(" "));
        words.stream().max((m,v)->m.compareToIgnoreCase(v));
        words.stream().findFirst();

    }
}
