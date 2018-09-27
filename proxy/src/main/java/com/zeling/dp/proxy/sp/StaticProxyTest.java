package com.zeling.dp.proxy.sp;

import com.zeling.dp.proxy.pub.IStudent;
import com.zeling.dp.proxy.pub.Pupil;

public class StaticProxyTest {

	public static void main(String[] args) {
		IStudent student = new Pupil();
		StudentProxy proxy = new StudentProxy(student);
		proxy.study();
	}

}
