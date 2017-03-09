package study.gaoqi.thread;

/**
 * 共享资源,抢火车票
 * 
 * @author wangc
 *
 */
public class Web12306 implements Runnable {
	private int ticketNumber = 1000;

	@Override
	public void run() {
		while (true) {
			synchronized(this){
				if (ticketNumber <= 0) {
					break;
				}
				ticketNumber--;
				System.out.println(Thread.currentThread().getName() + "抢到了，剩余" + ticketNumber + "张票");
			}
			
		}
	}

	public static void main(String[] args) {
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web, "黄牛1");
		Thread t2 = new Thread(web, "黄牛2");
		Thread t3 = new Thread(web, "黄牛3");
		t1.start();
		t2.start();
		t3.start();
	}

}
