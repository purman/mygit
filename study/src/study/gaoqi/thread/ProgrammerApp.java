package study.gaoqi.thread;

/**
 * 推荐实现Runnable接口：
 * 1.避免单继承
 * 2.共享资源
 * @author wangc
 *
 */

public class ProgrammerApp {
	public static void main(String[] args) {
		//1.创建真实角色
		Programmer programmer = new Programmer();
		//2.创建代理角色+真实角色引用
		Thread thread = new Thread(programmer);
		//3.调用start()启动线程
		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("一边听歌。。。");
		}
	}

}
