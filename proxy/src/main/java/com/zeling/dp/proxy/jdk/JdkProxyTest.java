package com.zeling.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.zeling.dp.proxy.pub.IStudent;
import com.zeling.dp.proxy.pub.Pupil;

/**
 * jdk动态代理测试
 * 
 * @author chenbd 2018年9月27日
 */
public class JdkProxyTest {

	public static void main(String[] args) {
		IStudent student = new Pupil();
		IStudent proxy = (IStudent) Proxy.newProxyInstance(student.getClass().getClassLoader(),
				student.getClass().getInterfaces(), new InvocationHandler() {
			
					private void enhancePost() {
						System.out.println("我是增强方法:post");
					}
					
					private void enhancePre() {
						System.out.println("我是增强方法:pre");
					}
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						enhancePre();
						Object obj = method.invoke(student, args);
						enhancePost();
						return obj;
					}
				});
		proxy.study();
	}

}
