package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class ReduceStream {
    public static void main(String[] args) {
/**
 * API Note:
 * Sum, min, max, average, and string concatenation are all special cases of reduction.
 * Summing a stream of numbers can be expressed as:
 *  Integer sum = integers.reduce(0, (a, b) -> a+b);
 * or:
 *  Integer sum = integers.reduce(0, Integer::sum);
 */

        int[] numberArray = {2, 6, 8};
        int sum = Arrays.stream(numberArray).sum();
        System.out.println("sum = " + sum);

        long count = Arrays.stream(numberArray).count();
        System.out.println("count = " + count);

        OptionalDouble optionalDouble = Arrays.stream(numberArray).average();
        System.out.println("average = " + optionalDouble.getAsDouble());

        //List of Objects
        List<Product> productList = Arrays.asList(
                new Product("potatoes", 15),
                new Product("orange", 15), new Product("lemon", 20),
                new Product("bread", 20), new Product("sugar", 30));

        //Find Sum of price from the list of products and return an Integer
        //approach-1
        Integer sumOfPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(0, (sum2, p) -> sum2 + p);
        System.out.println(" sumOfPrice " + sumOfPrice);

        //approach-2  same as above
        Integer sumOfPrice2 = productList.stream()
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
        System.out.println(" sumOfPrice2 " + sumOfPrice2);

        //approach-3 mapToInt() instead of map()
        int sumPrice3 = productList.stream()
                .mapToInt(Product::getPrice)
                .reduce(0, Integer::sum);
        System.out.println(" sumPrice3 " + sumPrice3);

        //approach-4 mapToInt() and sum()
        int sumPrice2 = productList.stream()
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(" sumPrice2 " + sumPrice2);

        //Find Maximum price from the list of products and return an Integer
        Integer maxPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(" maxPrice " + maxPrice);

        //Find Minimum price from the list of products and return an Integer
        Integer minPrice = productList.stream()
                .map(Product::getPrice)
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(" minPrice " + minPrice);

    }
}
