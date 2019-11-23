package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class ParallelStream {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("D:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split(" "));
        int[] showWords = new int[12];
        //线程不安全的计数
//        words.parallelStream().forEach(
//                m->{
//                    if (m.length() < 12){
//                        showWords[m.length()]++;
//                    }
//                }
//        );
//        System.out.println(Arrays.toString(showWords));
//        Map<Integer,Long> count = words.parallelStream().filter(m->m.length()<12).collect(Collectors.groupingBy(String::length, counting()));
//        System.out.println(count);

        //修改集合流元素
        List<String> list = new ArrayList(){{add("apple");add("banana");add("orange");}};
        Stream<String> stringStream = list.stream();
        list.add("pear");
        System.out.println(stringStream.count());
//        stringStream.forEach(
//                m->{
//                    if (m.equals("huang")){
//                        list.remove("huang");
//                    }
//                }
//        );
//        System.out.println(stringStream.count());

    }
}
