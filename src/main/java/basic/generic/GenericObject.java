package basic.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 编译期泛型
 *
 * @author linuxea
 * @date 2018/6/1
 */
public class GenericObject<T> {
	
	private List<T> tList;
	
	public static void main(String[] args) {
		GenericObject<String> stringGenericObject = new GenericObject<>();
		stringGenericObject.tList = new ArrayList<>();
		stringGenericObject.tList.add(String.valueOf(12));
//		INVOKEINTERFACE java/util/List.add (Ljava/lang/Object;)Z
	}
	
	
}
