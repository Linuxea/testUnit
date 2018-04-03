package basic.exception;

/**
 * https://stackoverflow.com/questions/5800629/setting-exception-cause-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
 *
 * @author linuxea
 * @date 2018/4/3
 */
public class CauseExceptionPass {
	
	public static void main(String[] args) {
		try {
			new CauseExceptionPass().run();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("23333333333333333");
			// cause: basic.exception.ApplicationException: 这是一个自定义应用异常
			System.out.println("cause: " + e.getCause());
		}
	}
	
	public void run() {
		ApplicationException applicationException = new ApplicationException("这是一个自定义应用异常");
		throw new RuntimeException("异常包装(嵌套)", applicationException);
	}
}
