package cn.zhe.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Configuration
@ComponentScan("cn.zhe")
public class MainStartTest {
	public static void main(String[] args) {
		// 更新影像信息(删除无效文件及无效记录)
		try {
			// 异步删除文件
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			Future<Object> sss = executorService.submit(() -> {
				System.out.println("sss");
//				return 1;
				throw new Exception();
			});
//			sss.get();
			try {
				sss.get();
			} catch (Exception e) {
				System.out.println("BBBBBBBBB");
			}

			executorService.shutdown();
		} catch (Exception e) {
			System.out.println("ssssss");
		}
		// SpringIOC 出发点
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainStartTest.class);
		HelloSpring bean = applicationContext.getBean(HelloSpring.class);
		bean.sayHello();
	}
}
