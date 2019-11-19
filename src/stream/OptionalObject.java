package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalObject {
    public static void main(String[] args) {
        List<String> relax = new ArrayList<>();
        relax.add("sleep");
        relax.add("music");
        System.out.println(relax);
        System.out.println(Optional.of(relax).filter(m->m.contains("eat")).orElse(Arrays.asList("吃饭")));
        Optional.of(relax).filter(m->m.contains("sleep")).ifPresent(w-> System.out.println("睡觉"));
        //System.out.println(Optional.of(relax).filter(m->m.contains("music")).map(m->m.set(m.indexOf("music"), "音乐")).orElse("未找到"));
        System.out.println(Optional.of(relax).filter(m->m.add("eat")).map(m->Arrays.asList("音乐","sleep")));
        System.out.println(relax);
    }
}
