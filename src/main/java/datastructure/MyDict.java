package datastructure;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class MyDict<K, V> extends Dictionary<K, V> {
	
	private transient Entry<K, V>[] table;
	
	@Override
	public int size() {
		return table.length;
	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public Enumeration<K> keys() {
		return null;
	}
	
	@Override
	public Enumeration<V> elements() {
		return null;
	}
	
	@Override
	public V get(Object key) {
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		return null;
	}
	
	@Override
	public V remove(Object key) {
		return null;
	}
}
