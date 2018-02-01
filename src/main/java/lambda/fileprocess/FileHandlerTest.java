package lambda.fileprocess;

import org.junit.Test;

import java.io.IOException;

/**
 * 文件处理函数式测试
 *
 * @author linuxea.lin
 */
public class FileHandlerTest {
	
	
	@Test
	public void test() throws IOException {
		
		new FileHandler().fileProcess(br -> {
			try {
				StringBuilder sb = new StringBuilder(10);
				sb.append(br.readLine());
				sb.append("\n");
				sb.append(br.readLine());
				System.out.println(sb.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
	}
	
}
