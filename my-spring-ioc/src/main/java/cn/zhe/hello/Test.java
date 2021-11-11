package cn.zhe.hello;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\zhe\\Desktop\\yht\\助贷后管上线\\数据库脚本.zip");
		if(file.exists()){
			file.delete();
		} else {
			System.out.println("file not exit");
		}
	}
}
