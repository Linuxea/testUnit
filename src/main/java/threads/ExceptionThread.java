package threads;

/**
 * 异常的调用栈信息
 */
public class ExceptionThread implements Runnable {

	public static void main(String[] args) {
//        no1 线程各自处理
//        new Thread(new ExceptionThread(), "sub thread").start();
//        new ExceptionThread().methrow();

		// no2 通过设置回调来处理子线程出现的异常
		Runnable sub = new ExceptionThread();
		Thread fuck = new Thread(sub, "sub thread");
		fuck.setUncaughtExceptionHandler((t, s) -> System.out.println("holly shit"));
		fuck.start();
	}

	public void methrow() {
		throw new ThreadException();
	}

	@Override
	public void run() {
		throw new ThreadException();
	}

	/**
	 * static exception nested class
	 */
	private static class ThreadException extends RuntimeException {
		public ThreadException() {
			System.out.println("thread exception occur");
		}
	}
}
