package study.gaoqi.thread;

/**
 * 使用静态代理，创建多线程
 * 
 * @author wangc
 *
 */
public class Programmer implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("一边写代码。。。");
		}
	}

}
