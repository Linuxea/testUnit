package io;

import com.alibaba.fastjson.JSON;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * @author linuxea
 * @date 2018/5/22
 */
public class JsonIo {
	
	public static void main(String[] args) throws IOException {
		People jiahua = new People("jiahua", 18);
		String string = JSON.toJSONString(jiahua);
		Files.write(string.getBytes(), new File("jiahua_json"));
	}
	
}
