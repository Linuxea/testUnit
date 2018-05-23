package lambda;

/**
 * 行为参数化
 *
 * @author linuxea
 * @date 2018/5/23
 */
public class LambdaDo {
	
	public static void main(String[] args) {
		LambdaDo lambdaDo = new LambdaDo();
		lambdaDo.doService(System.out::println);
		lambdaDo.doService(string -> System.out.println(string.length()));
	}
	
	public void doService(DoIt doIt) {
		String string = "this is something";
		doIt.print(string);
	}
	
	@FunctionalInterface
	private interface DoIt {
		void print(String string);
	}
}
