import java.util.*;
import java.util.function.*;
public class ConsumerBiConsumerTest <T>{

    public static void main(String[] args) {
        List<Person> plist = Arrays.asList(new Person("RAJA"), new Person("ADITHYA"));
        acceptAllEmployee(plist, (p) -> System.out.println(p));
       // acceptAllEmployee(plist, p -> {p.name = "unknown";});
     //   acceptAllEmployee(plist, p -> System.out.println(p.name));
    }
    public static void acceptAllEmployee(List<Person> plist, Consumer con) {
        for(Person p : plist) {
            con.accept(p);
        }
    }
}
