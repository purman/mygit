package study.gaoqi.thread;

public class RabbitApp {
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Tortoise tortoise = new Tortoise();
		rabbit.start();
		tortoise.start();
	}
}
