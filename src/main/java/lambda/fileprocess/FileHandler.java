package lambda.fileprocess;

import java.io.*;

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
                InputStream is = new FileInputStream("/home/linuxea/git_home/testUnit/src/main/java/lambda/fileprocess/ok.txt");
                InputStreamReader fileInputStream = new InputStreamReader(is);
                BufferedReader bufferedReader = new BufferedReader(fileInputStream)
        ) {
            process.believe(bufferedReader);
		}
	}
}
