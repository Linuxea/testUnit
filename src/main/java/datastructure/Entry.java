package datastructure;

import java.util.Map;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class Entry<K, V> implements Map.Entry<K, V> {
	
	final int hash;
	final K key;
	V value;
	Entry<K, V> next;
	
	public Entry(int hash, K key, V value, Entry<K, V> next) {
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}
	
	@Override
	public K getKey() {
		return this.key;
	}
	
	@Override
	public V getValue() {
		return this.value;
	}
	
	@Override
	public V setValue(V value) {
		V oldVal = this.value;
		this.value = value;
		return oldVal;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
