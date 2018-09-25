package 基础数据类型;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 读文件_gbk {
	public static void main(String[] args) throws IOException {
		File f=new File("1.txt");
		FileInputStream in = new FileInputStream(f);
		byte[] bs=new byte[300];
		in.read(bs);
		System.out.println(new String(bs,"UTF-8"));
		in.close();
		
	}
}
