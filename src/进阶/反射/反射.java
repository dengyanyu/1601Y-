package 进阶.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 反射 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		//反射获取实体对象
		Class c=User.class;
		Object u = c.newInstance();//实例化  new User
		//获取属性　调用属性
		Field nf = c.getDeclaredField("name");
		Object v = nf.get(u); // u.name
		System.out.println(v);
		//反射方法调用
		Method m = c.getMethod("say", null);
		m.invoke(u, null); //u.say()
//		User u=new User("小明");
//		u.say();
	}
}
