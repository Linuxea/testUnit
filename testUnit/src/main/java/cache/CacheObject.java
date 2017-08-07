package com.linuxea;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 *@date      2017年8月7日 上午9:09:06
 *@desc      map实现缓存
 *@version   1.0
 *@author    Linuxea.lin
*/
public class CacheUtils {
	
	private static final Map<String,CacheObject> cache =Maps.newConcurrentMap();
	
	/**
	 * set key value
	 * @param key
	 * @param data
	 * @param expireTime
	 */
	public static void set(String key,Object data, long expireTime){
		CacheObject ca = new CacheObject(key, data, expireTime);
		cache.put(key,ca);
	}
	
	/**
	 * 设置秒级缓存
	 * @param key
	 * @param data
	 * @param seconds
	 */
	public static void setWithSeconds(String key,Object data, int seconds){
		long expireTime = System.currentTimeMillis() + seconds * 1000;
		CacheObject ca = new CacheObject(key, data, expireTime);
		cache.put(key,ca);
	}
	
	/**
	 * 设置分钟级别缓存
	 * @param key
	 * @param data
	 * @param minutes
	 */
	public static void setWithMinutes(String key,Object data, int minutes){
		long expireTime = System.currentTimeMillis() + minutes * 60 * 1000;
		CacheObject ca = new CacheObject(key, data, expireTime);
		cache.put(key,ca);
	}
	
	/**
	 * 设置小时级别缓存
	 * @param key
	 * @param data
	 * @param hours
	 */
	public static void setWithHours(String key,Object data, int hours){
		long expireTime = System.currentTimeMillis() + hours * 60 * 60 * 1000;
		CacheObject ca = new CacheObject(key, data, expireTime);
		cache.put(key,ca);
	}
	
	/**
	 * 设置天数级别缓存
	 * @param key
	 * @param data
	 * @param days
	 */
	public static void setwithDays(String key,Object data, int days){
		long expireTime = System.currentTimeMillis() + days * 24 * 60 * 60 * 1000;
		CacheObject ca = new CacheObject(key, data, expireTime);
		cache.put(key,ca);
	}
	
	
	/**
	 * 设置不过时缓存
	 * @param key
	 * @param data
	 */
	public static void set(String key,Object data){
		set(key, data, -1);
	}
	
	/**
	 * get key value
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T get(String key){
		CacheObject thisCa = cache.get(key);
		if(thisCa.getExpireTime()<=0 || thisCa.getExpireTime()>System.currentTimeMillis()){
			return (T) thisCa.getValue();
		}
		//过时级别的缓存不在此处做销毁处理  以免销毁动作影响缓存带来的性能提升
		return null;
	}
	
	
	/**
	 * 清除所有的缓存
	 */
	public static void clear(){
		cache.clear();
	}
	
	/**
	 * 是否包含某个key值
	 * @param key
	 * @return
	 */
	public static boolean containsKey(String key){
		return cache.containsKey(key);
	}
	
	
	
	
	
	
	private static class CacheObject{
		private String key;
		private Object value;
		private long expireTime;
		
		public CacheObject(String key, Object value, long expireTime){
			this.key = key;
			this.value = value;
			this.expireTime = expireTime;
		}
		
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		public long getExpireTime() {
			return expireTime;
		}
		public void setExpireTime(long expireTime) {
			this.expireTime = expireTime;
		}
		
	}

}
