package stream;

import java.util.ArrayList;
import java.util.List;

public class ReductionOperation {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList(){{add(1);add(2);add(3);add(4);}};
        System.out.println(integerList.stream().reduce((m,v)->m+v));
        System.out.println(integerList.stream().reduce(0, (m,v)->m+v));

        List<String> stringList = new ArrayList(){{add("huang");add("jian");add("feng");}};
        System.out.println(stringList.stream().reduce(0, (total,word)->total+word.length(), (total1,total2)->total1+total2));
    }


}
