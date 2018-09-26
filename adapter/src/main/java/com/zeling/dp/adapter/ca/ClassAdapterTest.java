package com.zeling.dp.adapter.ca;

import com.zeling.dp.adapter.pub.DC;

/**
 * 类适配器测试
 * 
 * @author chenbd 2018年9月26日
 */
public class ClassAdapterTest {
	public static void main(String[] args) {
		DC dc = new ClassAdapter();
		dc.outputDC();
	}
}
