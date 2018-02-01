package lambda.streamtest;

import org.testng.collections.Lists;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 统计
 * Created by Linuxea on 10/28/17.
 */
public class CountStatic {
	
	public static void main(String[] args) {
		
		List<Integer> list = Lists.newArrayList(1, 2, 33, 231, 134, 553, -9);
		
		DoubleSummaryStatistics doubleSummaryStatistics =
				list.stream().collect(Collectors.summarizingDouble(Integer::new)); // haha doujiling as me
		
		System.out.println(doubleSummaryStatistics);
		
	}
}
