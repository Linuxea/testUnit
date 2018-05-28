package interview.baturu;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class SortRangeTest {
	
	private List<Integer> list = Arrays.asList(0, 1, 2, 3, 7, 5, 6, 8, 10);
	
	@Test
	public void testCount() {
		SortRange sortRange = new SortRange(list);
		sortRange.methodOne();
	}
	
}