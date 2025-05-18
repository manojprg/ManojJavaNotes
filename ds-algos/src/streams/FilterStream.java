package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStream {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("potatoes", 15),
                new Product("orange", 15), new Product("lemon", 20),
                new Product("bread", 20), new Product("sugar", 30));

        Integer p9 = productList.stream().filter(pr->pr.getPrice()>15).map(p->{
           return p.getPrice()+10;
        }).findFirst().get();
        System.out.println(" p9999 "+p9);







        //Filter to get a Product
        Product p1 = productList.stream().filter(p -> p.getName().equalsIgnoreCase("potatoes"))
                .findAny().orElse(null);
        System.out.println("Filtered Product " + p1);

        //Filter to get List of Product
        List<Product> p2list = productList.stream().filter(p -> p.getPrice() > 15)
                .collect(Collectors.toList());
        System.out.println("List of Filtered Products " + p2list);

        //To get count of list of Product
        long count2 = productList.stream().count();
        System.out.println("total count of Products " + count2);

        //To get count of list of filtered Product
        long count = productList.stream().filter(p -> p.getPrice() > 15)
                .count();
        System.out.println("count of Filtered Products " + count);


    }
}
