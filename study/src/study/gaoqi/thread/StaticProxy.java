package study.gaoqi.thread;

/**
 * 静态代理，Runable接口就是静态代理的例子
 * 1.真是角色
 * 2.代理角色（持有真实角色的引用）
 * 3.真实角色和代理角色要实现同一个接口
 * @author wangc
 *
 */
public class StaticProxy {
	
	public static void main(String[] args) {
		Marry me = new Me();
		WeddingCompany company = new WeddingCompany(me);
		company.marry();
		
	}
}

//静态代理的公共接口
interface Marry{
	void marry();
}

//真实对象
class Me implements Marry{

	@Override
	public void marry() {
		// TODO Auto-generated method stub
		System.out.println("我和xxx结婚了");
	}
}

//婚庆公司
class WeddingCompany implements Marry{
	private Marry who;
	
	public WeddingCompany() {
	}

	//通过构造方法，将真实对象传入进来
	public WeddingCompany(Marry me) {
		this.who = me;
	}
	
	private void beforeMarry(){
		System.out.println("结婚前，定酒店");
	}
	
	private void afterMarry(){
		System.out.println("结婚后，办理旅行签证");
	}
	@Override
	public void marry() {
		beforeMarry();
		who.marry();
		afterMarry();
	}
	
}


