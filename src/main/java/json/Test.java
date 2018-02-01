package json;

import com.alibaba.fastjson.JSON;

/**
 * json from
 * json to
 * test
 */
public class Test {
	
	public static void main(String[] args) {
		
		String result = JSON.toJSONString(new Person(1, "linuxea"));
		System.out.println(result);
		
		Person person = JSON.parseObject(result, Person.class);
		System.out.println(person);
		
	}
	
}
