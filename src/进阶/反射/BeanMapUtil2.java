package 进阶.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanMapUtil2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Order u=new Order();
		u.setNO("122331213131231231231");
		u.setAmount(333111);
		u.setF2("2");
		u.setF3("3");
		u.setF4("4");
		u.setF5("5");
		u.setF6("6");
		u.setF7("7");
		
		Map m=toMap(u);
		
		System.out.println(m);
		 
	}

	private static Map toMap(Object u) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HashMap<String,Object> m=new HashMap<>();
		Class c=u.getClass();
		Field[] fs = c.getFields();
		for (Field f : fs) {
			String fn=f.getName();
			String mn="get"+upfirst(fn);
			try {
				Method mth = c.getMethod(mn);
				Object x = mth.invoke(u);
//			System.out.println(fn+":"+x);
				m.put(fn, x);
			} catch (Exception e) {
			}
			
		}
		
		return m;
	}

	private static String upfirst(String fn) {
		return (fn.charAt(0)+"").toUpperCase()+fn.substring(1);
	}
}
