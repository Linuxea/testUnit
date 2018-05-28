package interview.baturu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 数字调整有序范围
 *
 * @author linuxea
 * @date 2018/5/29
 */
public class SortRange {
	
	private List<Integer> integers;
	
	public SortRange(List<Integer> integers) {
		this.integers = integers;
	}
	
	/**
	 * 计算实现有序数组的起始与终止范围
	 */
	public void methodOne() {
		List<Integer> originalList = new ArrayList<>(integers);
		integers.sort(Comparator.comparingInt(Integer::intValue));
		System.out.println(originalList);
		System.out.println(integers);
		int start = 0;
		int end = 0;
		for (int i = 0; i < originalList.size(); i++) {
			if (!originalList.get(i).equals(integers.get(i))) {
				if (start == 0) {
					start = i;
				} else {
					end = i;
				}
			}
		}
		if (end < start) {
			end = start;
		}
		System.out.println("[" + start + "," + end + "]");
	}
}
