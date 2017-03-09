package study.gaoqi.thread;

/**
 * 使用Thread创建多线程
 * 
 * @author wangc
 *
 */
public class Rabbit extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("兔子跑了10公里");
		}
	}
}

class Tortoise extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("乌龟跑了1公里");
		}
	}
}
