package threads;


import java.util.concurrent.TimeUnit;

/**
 * Created by Linuxea on 2017-09-23.
 */
/*
死锁：多线程中要进行资源的共享，就需要同步，但同步过多，就可能造成死锁
线程死锁：在一个同步方法中调用了另一个对象的同步方法，可能产生死锁
 */
public class DeadThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		new DeadRunnable();
	}
}

class Customer {
	public void say(Waiter waiter) {
		synchronized (waiter) {
			System.out.println("顾客说：先吃饭再买单！");
			waiter.doService(this);
		}
	}

	public void doService(Waiter waiter) {
		synchronized (waiter) {
			System.out.println("同意了，先买单再吃饭！");
		}
	}
}

class Waiter {
	public void say(Customer customer) {
		synchronized (customer) {
			System.out.println("服务员说：先买单再吃饭！");
			customer.doService(this);
		}
	}

	public void doService(Customer customer) {
		synchronized (customer) {
			System.out.println("同意了，先吃饭再买单！");
		}
	}
}

class DeadRunnable implements Runnable {
	Customer c = new Customer();
	Waiter w = new Waiter();

	public DeadRunnable() throws InterruptedException {
		while (true) {
			new Thread(this).start();
			c.say(w);
			TimeUnit.SECONDS.sleep(2);
			System.out.println("");
		}
	}

	@Override
	public void run() {
		w.say(c);
	}
}
