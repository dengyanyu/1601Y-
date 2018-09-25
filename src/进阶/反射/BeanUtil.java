package 进阶.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtil {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		User u=new User();
		u.setName("小张");
		u.setAge(12);
		/*u.setF1("1");
		u.setF2("2");
		u.setF3("3");
		u.setF4("4");
		u.setF5("5");
		u.setF6("6");
		u.setF7("7");*/
		
		Class c=u.getClass();
		for (int i = 1; i <= 7; i++) {
			Method m=c.getMethod("setF"+i, String.class);
			m.invoke(u, i+"");
		}
		
		System.out.println(u.f5);
		 
	}
}
