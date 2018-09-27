package com.zeling.dp.proxy.cglib;

import java.lang.reflect.Method;

import com.zeling.dp.proxy.pub.Pupil;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib代理测试
 * 
 * @author chenbd 2018年9月27日
 */
public class CglibProxyTest {

	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Pupil.class);
		enhancer.setCallback(new MethodInterceptor() {
			
			private void enhancePost() {
				System.out.println("我是增强方法:post");
			}
			
			private void enhancePre() {
				System.out.println("我是增强方法:pre");
			}
			
			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				enhancePre();
				Object result = method.invoke(pupil, args);
				enhancePost();
				return result;
			}
		});
		Pupil proxy = (Pupil) enhancer.create();
		proxy.study();
	}

}
