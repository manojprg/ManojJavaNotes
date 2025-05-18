package designpattern;

public class SingleTonEarlyLoading {
	
	private static SingleTonEarlyLoading singleton = new SingleTonEarlyLoading();

	private SingleTonEarlyLoading() {

	}

	public static SingleTonEarlyLoading getInstance() {

		return singleton;
	}
}
