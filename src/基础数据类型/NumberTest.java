package 基础数据类型;

public class NumberTest {
	public static void main(String[] args) {
	/*	System.out.println(0.1+0.2);
		byte b=Byte.MAX_VALUE;
		System.out.println(++b);
		byte bx=Byte.MAX_VALUE;
		System.out.println(1+bx);
		long a=1L;
		float f=.1f;
		double d=.1;
		int i=1;
		double dx=0x1;
		int ba=012;
		System.out.println(ba);
		
//		Stri数据结构结构  array arraylist区别
//		char c='a';//97
		for (char j = Character.MIN_VALUE; j < Character.MAX_VALUE; j++) {
			System.out.print(j);
		}*/
		
//		String str="中国人a";
//		byte[] bs=str.getBytes();
//		for (byte b : bs) {
//			System.out.println(b);
//		}
//		
		
		String str="abc";
//		String strx="nihao";
//		String str1=new String("nihao");
		System.out.println(str.hashCode()-((31*97+98)*31+99));
		
	}
}
