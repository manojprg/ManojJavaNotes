package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralStream {
    public static void main(String[] args) {

        // a. iterator() : We can use stream to iterate any number of times
        Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);

        List<Person> personList = Arrays.asList(new Person(1, "Ram", 25),
                new Person(2, "Peter", 31),
                new Person(3, "Steve", 25),
                new Person(4, "Balu", 32),
                new Person(5, "Ramlala", 5),
                new Person(6, "Peter", 15));

        // b. unique name in a list of personList and return list of string

        List<String> uniqueNames = personList.stream()
                .map(p -> p.getName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueNames " + uniqueNames);

        // c. anyMatch

        boolean flag = personList.stream()
                .map(Person::getName)
                .anyMatch(p -> "R".startsWith(p));
        System.out.println("is name starts with R " + flag);

        // c. findAny
        String name = personList.stream()
                .map(Person::getName)
                .filter(p -> p.startsWith("R"))
                .findAny().get();
        System.out.println("name starts with R " + name);

        //nth heighest salary

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("manoj", 1000);
        map1.put("bhawna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);
        //3rd heighest salary
        Map.Entry<String, Integer> results = map1.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(3 - 1);
        System.out.println(results);

        //Min age, max age, average age , total age using summarizing
        LongSummaryStatistics stat = personList.stream().collect(Collectors.summarizingLong(p-> p.getAge()));
        System.out.println("Minimum age among personList "+stat.getMin());
        System.out.println("Maximum age among personList "+stat.getMax());
        System.out.println("Total age among personList "+stat.getSum());
        System.out.println("Average age among personList "+stat.getAverage());

        //List of Objects
        List<Product> productList = Arrays.asList(
                new Product("potatoes", 15),
                new Product("orange", 15), new Product("lemon", 20),
                new Product("bread", 20), new Product("sugar", 30));

        //Find average price from the list of products and return an Integer
        double averagePrice = productList.stream()
                .mapToInt(Product::getPrice)
                .average()
                .orElse(0);
        System.out.println(" averagePrice " + averagePrice);

        // Find product with max price and return the product details
        Product maxProd = productList.stream()
                .max((prod1, prod2) -> prod1.getPrice() > prod2.getPrice() ? 1 : -1)
                .get();
        System.out.println(" product with Maximum price " + maxProd);

        Product maxProduct = productList.stream()
                .max(Comparator.comparingInt(Product::getPrice))
                .get();
        System.out.println(" product with Maximum price " + maxProduct);

        // Find product with minimum price and return the product details
        Product minProd = productList.stream().min((prod1, prod2) ->
                prod1.getPrice() > prod2.getPrice() ? 1 : -1)
                .get();
        System.out.println(" product with Minimum price " + minProd);

        Product minProduct = productList.stream()
                .min(Comparator.comparingInt(Product::getPrice))
                .get();
        System.out.println(" product with Minimum price " + minProduct);
    }
}
