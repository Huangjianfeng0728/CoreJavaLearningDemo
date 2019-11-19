package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTransform {
    String content = new String(Files.readAllBytes(Paths.get("E:\\CoreJavaLearningDemo\\resources\\alice.txt")), StandardCharsets.UTF_8);
    //1,集合调用stream方法
    List<String> words = Arrays.asList(content.split(" "));
    long cal = words.stream().filter(w->w.length()>12).count();
    Stream mapStream = words.stream().map(v->v.toUpperCase());
    //将[[1,2,3],[3,4,5]]--->展开为[1,2,3,3,4,5]
    Stream flatmapStream = words.stream().flatMap(w->letters(w));
    public void abstactStream(){
        //抽取子流
        Stream<Double> limit = Stream.generate(()->Math.random()).limit(100);
        Stream<Double> skip = Stream.generate(()->Math.random()).skip(100);
        Stream<Double> concat = Stream.concat(limit, skip);

    }

    public static void main(String[] args) {
        Stream.iterate(1.0, p->p*2).peek(e-> System.out.println("Fetching"+e)).limit(20).toArray();
    }




    public Stream letters(String s){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            list.add(s.substring(i, i+1));
        }
        return list.stream();
    }
    public StreamTransform() throws IOException {
    }
}
