package string;

public class StringSwap {
    public static void main(String[] args) {
        String a = "manoj";
        String b = "sharma";
        System.out.println("before swap: a=" + a + " b=" + b);
        a = a + b; //manojsharma //11
        b = a.substring(0, a.length() - b.length());//0- [11-6=5] //manoj
        a = a.substring(b.length());//sharma
        System.out.println("after swap: a=" + a + " b=" + b);
    }
}
