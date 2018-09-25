package 基础数据类型;

public class GBK1 {
	public static void main(String[] args) {
//		String str="中国人a";
//		byte[] bs=str.getBytes();
//		for (byte b : bs) {
//			System.out.println(b);
//		}
		
		for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; i++) {
			for (byte j = Byte.MIN_VALUE; j <  Byte.MAX_VALUE; j++) {
				byte[] bs=new byte[2];
				bs[0]=i;
				bs[1]=j;
				System.out.print(new String(bs));
			}
		}
	}
}
