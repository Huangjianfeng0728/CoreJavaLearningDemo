package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TraditionalWordCount {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("E:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);

        //System.out.println(content);
        List<String> words = Arrays.asList(content.split(" "));
        long count = 0;
        for (String w : words){
            if (w.length() > 12){
                count++;
            }
        }
        System.out.println(words);
        System.out.println(count);
        //stream
        long cal = words.stream().filter(w->w.length()>12).count();
        System.out.println(cal);
    }
}
