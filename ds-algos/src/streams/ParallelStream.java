package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took time : " + (end - start));

        System.out.println("============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time : " + (end - start));


        IntStream.range(1, 10).forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(1, 10).parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        List<Employee> employees = Stream.of(new Employee(101, "john", "A", 60000),
                        new Employee(109, "peter", "B", 30000),
                        new Employee(102, "mak", "A", 80000),
                        new Employee(103, "kim", "A", 90000),
                        new Employee(104, "json", "C", 15000))
                .collect(Collectors.toList());

        //normal
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal stream execution time : " + (end - start) + " : Avg salary : " + salaryWithStream);

        start = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end = System.currentTimeMillis();

        System.out.println("Parallel stream execution time : " + (end - start) + " : Avg salary : " + salaryWithParallelStream);

    }
}
