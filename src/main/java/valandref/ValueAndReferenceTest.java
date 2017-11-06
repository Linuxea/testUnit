package valandref;

/**
 * Created by Linuxea on 11/6/17.
 */

public class ValueAndReferenceTest {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Person person = new Person(1, "linuxea");
        System.out.println("before: " + person.toString());
        change(person);
        System.out.println("after: " + person.toString());
    }

    private static void change(Person person) {
        person.setId(2);
    }

}

class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
