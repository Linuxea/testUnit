package basic.valueorreference;

/**
 * Created by Linuxea on 2017/9/26.
 */
public class PassReference {


	public static void main(String[] args) {
		User user = new User("1", "linuxea");
		changeUser(user);
		System.out.println(user.getName());
	}

	private static void changeUser(User user) {

		user.setName("after change linuxea");

	}


}

class User {
	String id;
	String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
