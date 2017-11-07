package threads;

/**
 * 异常的调用栈信息
 */
public class ExceptionThread implements Runnable {

    public static void main(String[] args) {
//        new Thread(new ExceptionThread(), "sub thread").start();

//        new ExceptionThread().methrow();
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
