package io;

import java.io.Serializable;

/**
 * @author linuxea
 * @date 17-11-30
 **/
public class PiKaQ implements Serializable {
	
	private int id;
	private String name;
	
	public PiKaQ(int id, String name) {
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
		return "PiKaQ{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

