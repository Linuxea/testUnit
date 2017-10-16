package lambda.fileprocess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * key login
 * 行为参数化
 * @author linuxea.lin
 *
 */
public class FileHandler {
	
	public void fileProcess(Process process) throws IOException {
		
		// try-with-resources
		try(
			InputStream is = this.getClass().getResourceAsStream("ok.txt");
			InputStreamReader fileInputStream = new InputStreamReader(is);
			BufferedReader bufferedReader = new BufferedReader(fileInputStream);
		){
			process.believe(bufferedReader);
		}
	}
}
