package cn.zhe.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestATBean {
	@Bean
	public Test helloSpring() {
		return new Test();
	}
}
