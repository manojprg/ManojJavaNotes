package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToAnotherCollectionStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        // Adding Products
        productList.add(new Product(1, "Sony mobile", 25000));
        productList.add(new Product(2, "Lenovo mobile", 15000));
        productList.add(new Product(3, "Nokia mobile", 10000));
        productList.add(new Product(4, "Samsung mobile", 40000));
        productList.add(new Product(5, "Micromax mobile", 10000));

//Convert list of product to set of product
        Set<Product> productSet =
                productList.stream()
                        .collect(Collectors.toSet());

        System.out.println("productSet " + productSet);

        //Convert list of product to set of Integer ()set of product price
        Set<Integer> productPriceSet =
                productList.stream()
                        .filter(product -> product.getPrice() < 20000) // filter product on the base of price
                        .map(product -> product.getPrice())
                        .collect(Collectors.toSet()); //collect it as Set(remove duplicate elements)

        System.out.println("productPriceSet " + productPriceSet);

        Map<String, Integer> mapProd = productList.stream()
                .collect(Collectors.toMap(p -> p.getName(), p -> p.getPrice()));
        System.out.println("mapProd " + mapProd);
    }
}
