package json;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

/**
 * @author linuxea
 * @date 2018/6/7
 */
public class Json2Map2 {
	
	@Test
	public void run() {
		Map<String, Object> parse = (Map) JSONObject.parse("{\n" +
				"    \"result\":{\n" +
				"        \"paramMap\":{\n" +
				"            \"pageSize\":\"50\",\n" +
				"            \"idcard\":\"4407030600053741\",\n" +
				"            \"currentPage\":\"1\"\n" +
				"        },\n" +
				"        \"code\":103,\n" +
				"        \"msg\":\"验证串校验错误\",\n" +
				"        \"header\":{\n" +
				"            \"bsName\":\"personContractBS\",\n" +
				"            \"ip\":\"sssssssss\",\n" +
				"            \"method\":\"listContract\",\n" +
				"            \"operateId\":\"userId\",\n" +
				"            \"operateName\":\"userName\",\n" +
				"            \"operateTm\":\"Jmzhrs\",\n" +
				"            \"systemId\":\"Jmzhrs\",\n" +
				"            \"systemPassword\":\"A04A06D51A830FBEA157AC288A569899A8B790007E4C8660\",\n" +
				"            \"validStr\":\"498AF3E756A24AA7ED694812A7B7FC3D3E10C0A7C7532A988868A81F8763D0A4D9835990F51BF9FFAB2EA690E9AB2109E59A2899CF1FB52AA29A766DB65537AA\"\n" +
				"        },\n" +
				"        \"wsUser\":null\n" +
				"    },\n" +
				"    \"data\":\"\"\n" +
				"}\n");
		
		Iterator<String> iterator = parse.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			Object jsonObject = parse.get(next);
			System.out.println(jsonObject);
		}
		
	}
	
}
