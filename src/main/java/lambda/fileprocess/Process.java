package lambda.fileprocess;

import java.io.BufferedReader;


/**
 * 文件处理函数式接口
 *
 * @author linuxea.lin
 */
@FunctionalInterface
public interface Process {
	
	void believe(BufferedReader br);

}
