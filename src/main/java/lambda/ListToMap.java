package lambda;

/**
 * @author linuxea
 * @date 2018/4/9
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author linuxea
 * @date 2018/4/9
 */
public class ListToMap {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "linuxea"));
		userList.add(new User(2, "xiaoming"));
		userList.add(new User(3, "daming"));
		userList.add(new User(4, "zhongming"));
		userList.add(new User(4, "laoming"));
		
		Map<Integer, User> collect = userList.stream().collect(Collectors.toMap(User::getAge, Function.identity(), (key1, key2) -> key2));
		System.out.println(collect);
	}
	
	
	private static class User {
		int age;
		String name;
		
		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "User{" +
					"age=" + age +
					", name='" + name + '\'' +
					'}';
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
}

