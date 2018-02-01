package howjedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by Linuxea on 11/5/17.
 */

public class JedisTest {
	
	private Jedis jedis;
	
	@Before
	public void before() {
		jedis = new Jedis("localhost");
	}
	
	@Test
	public void stringTest() {
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.println(value);
	}
	
	@Test
	public void listTest() {
		jedis.lpush("persons", "linuxea");
		jedis.lpush("persons", "pony");
		jedis.lpush("persons", "bonnie");
		jedis.lpush("persons", "judy");
		long len = jedis.llen("persons");
		System.out.println("list len : " + len);
		while (true) {
			String temp = jedis.lpop("persons");
			if (null != temp) {
				System.out.println(temp);
			} else {
				break;
			}
		}
	}
	
	@Test
	public void setTest() {
		jedis.sadd("girls", "little red", "little blue", "little pink");
		jedis.sadd("boys", "nothing", "big  blue", "little pink");
		System.out.println("set inter :" + jedis.sinter("girls", "boys"));
	}
	
	@Test
	public void mapTest() {
		jedis.hset("me", "name", "linuxea");
		jedis.hset("me", "age", "10");
		jedis.hset("me", "sex", "boy");
		Map<String, String> me = jedis.hgetAll("me");
		Set<String> keys = me.keySet();
		for (String keyTemp : keys) {
			System.out.println(keyTemp + ":" + me.get(keyTemp));
		}
	}
	
	
	@After
	public void after() {
		jedis.close();
	}
}


class Person implements Serializable {
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
