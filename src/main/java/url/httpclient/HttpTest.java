package url.httpclient;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpTest {

    private String url = "https://www.ibm.com/developerworks/cn/opensource/os-httpclient/index.html";

    @Test
    public void getMethodTest() throws IOException {
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        int stateCode = 0;
        String haha = null; //此变量忽略  只是为了做个demo
        try {
            haha = "abc";
            stateCode = httpClient.executeMethod(getMethod);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(HttpStatus.SC_OK);
        System.out.print(stateCode);
        System.out.print(haha);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getMethod.getResponseBodyAsStream()));) {
            String line;
            while (null != (line = reader.readLine())) {
                System.out.println(line);
            }
        } finally {
            getMethod.releaseConnection();
        }
    }


    @Test
    public void postMethodTest() {
        String choiceUrl = "http://www.baidu.com";
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(choiceUrl);
        NameValuePair[] nameValuePairs = {new NameValuePair("username", "username"),
                new NameValuePair("password", "admin")};
        postMethod.setRequestBody(nameValuePairs);
        int stateCode = 0;
        try {
            stateCode = httpClient.executeMethod(postMethod);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stateCode == HttpStatus.SC_OK);
        Header location = postMethod.getResponseHeader("location");
        String locationVal = location.getValue();
        System.out.println(locationVal);

        String responseString = null;
        try {
            responseString = postMethod.getResponseBodyAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(responseString);
    }

}
