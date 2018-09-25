package 进阶.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class 根据参数获取对象 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
//		req.getParamterMaps() 返回时一个map的所有参数
		Map m=new HashMap() {{
			put("name", "zs");
			put("age", 11);
			put("f1", "f1value");
		}};
		User u=toBean(m);
		
		System.out.println(m);
		 
	}

	private static User toBean(Map m) {
		return null;
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
