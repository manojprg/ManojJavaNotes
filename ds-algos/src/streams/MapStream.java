package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person(1, "Ram", 25),
                new Person(2, "Peter", 31),
                new Person(3, "Steve", 25),
                new Person(4, "Balu", 32),
                new Person(5, "Ramlala", 5));

        //convert Stream<Person> to Stream<String> using map method

        List<String> p1 = personList.stream()
                .filter(p -> p.getName().startsWith("R"))
                .map(p -> p.getName())
                .collect(Collectors.toList());
        System.out.println("List of filtered using map " + p1);

        //convert Stream<Person> to String using map method

        String p2 = personList.stream()
                .filter(p -> p.getName()
                .startsWith("R"))
                .map(p -> p.getName())
                .findAny().orElse(null);
        System.out.println("String name filtered using map " + p2);
    }
}
