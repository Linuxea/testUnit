package threads.singleton;

/**
 * 静态内部类实现单例
 */
public class StaticClassSingleton {

	private StaticClassSingleton() {
	}

	public static StaticClassSingleton getInstance() {
		return StaticClassSingleton.StaticClassSingletomWrapper.staticClassSingletom;
	}

	public static void main(String[] args) {
		StaticClassSingleton instance = StaticClassSingleton.getInstance();
		StaticClassSingleton instance1 = StaticClassSingleton.getInstance();

		System.out.println(instance == instance1);
	}

	private static class StaticClassSingletomWrapper {
		static StaticClassSingleton staticClassSingletom = new StaticClassSingleton();
	}

}
