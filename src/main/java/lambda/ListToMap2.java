package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author linuxea
 * @date 2018/4/9
 */
public class ListToMap2 {
	
	public static void main(String[] args) {
		new ListToMap2().go();
	}
	
	public void go() {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "mkyong.com", 1));
		list.add(new Hosting(6, "linode222.com", 100000));
		list.add(new Hosting(6, "linode333.com", 100000));
		
		//example 1
		LinkedHashMap<Integer, Long> collect = list.stream()
				.sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
				.collect(
						Collectors.toMap(
								// key = name, value = websites
								Hosting::getName, Hosting::getWebsites,
								// if same key, take the old key
								(oldValue, newValue) -> newValue,
								// returns a LinkedHashMap, keep order
								LinkedHashMap::new
						));
		
		System.out.println("Result 1 : " + collect);
	}
	
	
}

/**
 *
 */
class Hosting {
	private int name;
	private long Websites;
	private String val;
	
	public Hosting(int name, String kk, long Websites) {
		this.name = name;
		this.Websites = Websites;
		this.val = kk;
	}
	
	public int getName() {
		return name;
	}
	
	public void setName(int name) {
		this.name = name;
	}
	
	public long getWebsites() {
		return Websites;
	}
	
	public void setWebsites(long websites) {
		Websites = websites;
	}
	
	public String getVal() {
		return val;
	}
	
	public void setVal(String val) {
		this.val = val;
	}
}
