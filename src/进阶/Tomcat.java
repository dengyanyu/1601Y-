package 进阶;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tomcat {
	public static void main(String[] args) throws IOException {
		int port=8080;
		ServerSocket ss=new ServerSocket(port);
		System.out.println("服务器已经启动...");
		Socket s = ss.accept();//阻塞等待请求
		InputStream in=s.getInputStream();
		OutputStream ou=s.getOutputStream();
		//1服务器怎么说的
			byte[] bs=new byte[1020];
			in.read(bs);
			System.out.println("服务器说:\r\n"+new String(bs));
		//2浏览器该怎么回
		ou.write(("HTTP/1.1 200 OK\r\n"+
				"Content-Type: text/html;charset=UTF-8\r\n" + 
				"\r\n"+//内容和头信息之间要加一个换行
				"hello 中国<button onclick='alert(location.href)' style='color:red'>abc</button>").getBytes());
		
		in.close();
		ou.flush();
		ou.close();
	
	}
}
