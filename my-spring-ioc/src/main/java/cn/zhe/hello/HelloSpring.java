package cn.zhe.hello;

import org.springframework.stereotype.Service;

@Service(value = "HelloSpring")
public class HelloSpring {
	public void sayHello() {

		System.out.println("Hello Spring");
	}
}
