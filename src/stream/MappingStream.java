package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingStream {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(new Person(1,"huang"), new Person(1, "jian"), new Person(2, "feng"));
        Map<Integer, String> map = personStream.collect(Collectors.toMap(m->m.getId(), v->v.getName(), (n,o)->n));
        for (Integer key : map.keySet()){
            System.out.println(map.get(key));
        }


        Stream<Person> personStreamSet = Stream.of(new Person(1,"huang",new ArrayList<String>(){{add("music");}}),
                new Person(2, "huang", new ArrayList<String>(){{add("music");add("dance");}}),
                new Person(3, "feng",new ArrayList<String>(){{add("reading");add("exercise");}}));
//        Map<String, List<String>> nameKey = personStreamSet.collect(Collectors.toMap(Person::getName, Person::getHobby,
//                                        (m,v)->{
//                                            Set<String> set = new HashSet<>(v);
//                                            set.addAll(m);
//                                            return new ArrayList<>(set);
//                                        }));
//        System.out.println(nameKey);

        Map<String, List<Person>> map1 = personStreamSet.collect(Collectors.groupingBy(Person::getName));
        for (Person person : map1.get("huang")){
            System.out.println(person.getHobby());
        }
    }


}
class Person{
    private int id;
    private String name;
    private List<String> hobby;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, List<String> hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
