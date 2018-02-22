package office.pojo;

import io.github.biezhi.excel.plus.converter.Converter;

/**
 * 运营商类型转换器
 *
 * @author linuxea
 * @date 2018/2/22
 */
public class CardTypeConverter implements Converter<Integer> {
	
	@Override
	public String write(Integer value) {
		return value.equals(1) ? "联通" : "移动";
	}
	
	@Override
	public Integer read(String value) {
		return value.equals("联通") ? 1 : 2;
	}
}