package study.gaoqi.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用Callable创建多线程
 * 1.有返回值
 * 2.可以抛出异常
 * 
 * @author wangc
 *
 */
public class Call {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(2);
		Race rabbit = new Race("兔子", 50);
		Race tortoise = new Race("乌龟", 100);
		
		Future<Integer> result1 = service.submit(rabbit);
		Future<Integer> result2 = service.submit(tortoise);
		
		Thread.sleep(2000);//线程执行8秒
		rabbit.setFlag(false);
		tortoise.setFlag(false);
		
		
		Integer num1 = result1.get();
		Integer num2 = result2.get();
		
		System.out.println("兔子跑了："+num1);
		System.out.println("乌龟跑了："+num2);
		
		service.shutdown();
		
	}
}

/**
 * 比赛类，返回一定时间内跑的路程
 * 
 * @author wangc
 *
 */
class Race implements Callable<Integer> {
	private String name;
	private long time;
	private int step = 0;
	private boolean flag = true;

	public Race() {
		super();
	}

	public Race(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}

	@Override
	public Integer call() throws Exception {
		while (flag) {
			Thread.sleep(time);
			step++;
		}
		return step;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}
