package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class GeneralPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        // Adding Products
        productList.add(new Product(1, "Sony mobile", 25000));
        productList.add(new Product(2, "Lenovo mobile", 15000));
        productList.add(new Product(3, "Nokia mobile", 10000));
        productList.add(new Product(4, "Samsung mobile", 40000));
        productList.add(new Product(5, "Micromax mobile", 10000));

        LongSummaryStatistics size = productList.stream().filter(p->p.getPrice()>30000).collect(Collectors.summarizingLong(p-> p.getPrice()));
        System.out.println(size.getMin());

        Product p = productList.stream().min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
        System.out.println("max - price "+ p.getPrice());

        Map<String, Integer> map = productList.stream()
                .collect(Collectors.toMap(p1->p1.getName(),p1->p1.getPrice()));
        productList.stream().collect(Collectors.toSet());

        List<Product> list= productList.stream()
                .filter(p2->p2.getName().length()>12)
                .collect(Collectors.toList());
        System.out.println("");
    }
}
