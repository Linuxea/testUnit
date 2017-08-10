package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * StringFiltertest
 */
public class ChainDesign {

	private static final StringChain toUpperFilter = new ToUpperFilter();
	private static final StringChain filterDigitFilter = new FilterDightFilter();
	private static final StringChain endFilter = new AppendGoodFilter();

	public static void init(){
		toUpperFilter.setNext(filterDigitFilter);
		filterDigitFilter.setNext(endFilter);
	}

	public static void run(){
		String result = toUpperFilter.begin("abc123");
		System.out.println(result);
	}

	public static void main(String[] argc){
		ChainDesign.init();
		ChainDesign.run();
	}

}
