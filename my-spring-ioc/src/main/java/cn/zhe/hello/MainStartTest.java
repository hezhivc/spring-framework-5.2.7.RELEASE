package cn.zhe.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.zhe")
public class MainStartTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(MainStartTest.class);
		HelloSpring bean = applicationContext.getBean(HelloSpring.class);
		bean.sayHello();
	}
}
