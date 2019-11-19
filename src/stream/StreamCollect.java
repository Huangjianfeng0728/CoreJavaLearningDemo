package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("E:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);
        //System.out.println(content);
        List<String> words = Arrays.asList(content.split(" "));
        words.stream().forEach(m-> System.out.println(m));
        List<String> list = words.stream().collect(Collectors.toList());
        words.stream().collect(Collectors.toCollection(TreeSet::new));
        String string = words.stream().collect(Collectors.joining("==="));
        //System.out.println(string);

    }
}
