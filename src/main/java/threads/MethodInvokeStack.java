package threads;

/**
 * 异常调用信息栈查看
 * 异常是执行单位是线程,异常信息栈是线程所执行的方法调用栈
 */
public class MethodInvokeStack {

    public static void main(String[] args) {
        MethodInvokeStack methodInvokeStack = new MethodInvokeStack();
        methodInvokeStack.one();

        // main -> one -> two -> three -> four
    }

    public void one() {
        two();
    }

    private void two() {
        three();
    }

    private void three() {
        four();
    }

    private void four() {
        throw new RuntimeException("I am running ");
    }
//
//    Exception in thread "main" java.lang.RuntimeException: I am running
//    at threads.MethodInvokeStack.four(MethodInvokeStack.java:18)
//    at threads.MethodInvokeStack.three(MethodInvokeStack.java:14)
//    at threads.MethodInvokeStack.two(MethodInvokeStack.java:10)
//    at threads.MethodInvokeStack.one(MethodInvokeStack.java:6)
//    at threads.MethodInvokeStack.main(MethodInvokeStack.java:23)

}
