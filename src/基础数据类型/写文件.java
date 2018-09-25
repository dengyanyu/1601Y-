package 基础数据类型;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class 写文件 {
	public static void main(String[] args) throws IOException {
		File f=new File("1.txt");
		f.createNewFile();
		FileOutputStream fo=new FileOutputStream(f);
		fo.write("abc中国".getBytes());
		fo.flush();fo.close();
		
	}
}
