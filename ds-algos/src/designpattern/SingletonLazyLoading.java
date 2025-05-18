package designpattern;

import java.util.Objects;

public class SingletonLazyLoading {

	private volatile static SingletonLazyLoading singleton;

	private SingletonLazyLoading() {

	}

	public static SingletonLazyLoading getInstance() {

		if (Objects.isNull(singleton)) {
			synchronized (SingletonLazyLoading.class) {
				if (Objects.isNull(singleton)) {
					singleton = new SingletonLazyLoading();
				}
			}

		}
		return singleton;
	}

}
