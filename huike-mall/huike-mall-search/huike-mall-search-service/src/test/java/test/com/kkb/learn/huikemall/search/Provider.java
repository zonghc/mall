package test.com.kkb.learn.huikemall.search;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-dubbo.xml");
		context.start();
		System.in.read(); // 按任意键退出
	}
}