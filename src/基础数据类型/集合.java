package 基础数据类型;

import java.util.LinkedList;
import java.util.List;

public class 集合 extends Thread{
	@Override
	public void run() {
		super.run();
	}
	int age;
	String name;
	public static void main(String[] args) {
		System.out.println(args+args[0]);
//		List<String> strs=new LinkedList<String>() {{
//			add("1");add("2");add("3");
//		}};
//		for (int i = 0; i < 10000; i++) {
//			strs.add(0, "3");
//		}
//		long st=System.currentTimeMillis();
//		strs.get(5000);
//		long ed=System.currentTimeMillis();
//		System.out.println(ed-st);
		
//		String[] str2=new String[]{"1","2","3"};str2[3]="3";
//		System.out.println(str2.length);
		
		List<String> strs=new LinkedList<String>() {{
			add("1");add("2");add("3");
		}};
		show(strs);
		
		strs.remove("1");
		System.out.println(strs);
		
	}

	public static void show(List<String> strs) {
		for (String string : strs) {
			if (string.equals("1")) {
				
			}
		}
	}
}
