package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 *@date      2017年6月20日 下午4:39:08
 *@desc      class description
 *@version   1.0
 *@author    Linuxea.lin
*/
public class LambadTest {
	
	@Test
	public void test1(){
		int result = IntStream.range(0,100).sum();
		System.out.println(result);
	}
	
	@Test
	public void test2(){
		int rs = IntStream.range(0, 101).skip(0).sum();
		System.out.println(rs);
	}
	
	@Test
	public void test3(){
		Function<Integer, Integer> a = i -> i+1;
		Integer i = a.apply(1);
		System.out.println(i);
	}
	
	@Test
	public void test4(){
		java.util.stream.LongStream.range(0, 100).filter(l -> l%2==0).forEach(System.out::println);
	}
	
	Consumer<Integer> c = new Consumer<Integer>(){
		@Override
		public void accept(Integer t) {
			System.out.println("accept:" + t);
		}
		
	};
	
	@Test
	public void test5(){
		Stream<Integer> ins = Stream.of(1,2,3,4);
		ins.map(i -> i+1).forEach(c);
	}
	
	private static class Person{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		
	}
	
	@Test
	public void test6(){
		List<Person> person = Arrays.asList( new Person("linuxea", 30),new Person("bonnie", 18),
				new Person("togo", 30),
				new Person("edwin", 30),
				new Person("vicky", 18));
		IntStream is = person.stream().mapToInt(shit -> shit.getAge());
		is.boxed().forEach(System.out::println);
	}
	
	@Test
	public void test7(){
		System.out.println("abc".hashCode());
		System.out.println("abc".hashCode());
	}
	
	@Test
	public void test8(){
		List<String> list = Arrays.asList("abc","def","ad213232ad");
		List<String> newList = list.stream().map(String::toUpperCase).collect(java.util.stream.Collectors.toList());
		for(String temp: newList){
			System.out.println(temp);
		}
	}
	
	
}
