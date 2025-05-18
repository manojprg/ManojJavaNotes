package designpattern;

public class SinglrtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonLazyLoading obj=SingletonLazyLoading.getInstance();
		SingletonLazyLoading obj2=SingletonLazyLoading.getInstance();
		SingletonLazyLoading obj3=SingletonLazyLoading.getInstance();
		SingletonLazyLoading obj4=SingletonLazyLoading.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
