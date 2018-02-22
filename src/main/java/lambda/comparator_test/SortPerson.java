package lambda.comparator_test;

import org.testng.collections.Lists;

import java.util.Comparator;
import java.util.List;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class SortPerson {
	
	public static void main(String[] args) {
		List<Person> personList = Lists.newArrayList(new Person("linuxea", 12), new Person("bobo", 19), new Person("gava", 16), new Person("yili", 14));
		personList.sort(Comparator.comparingInt(Person::getAge));
		System.out.println(personList);
		
		personList.sort(Comparator.comparingInt(Person::getAge).reversed());
		System.out.println(personList);
		
	}
	
}
