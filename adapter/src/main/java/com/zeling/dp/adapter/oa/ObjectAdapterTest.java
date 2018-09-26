package com.zeling.dp.adapter.oa;

import com.zeling.dp.adapter.pub.DC;
import com.zeling.dp.adapter.pub.StandardAC;

/**
 * 对象适配器
 * 
 * @author chenbd 2018年9月26日
 */
public class ObjectAdapterTest {

	public static void main(String[] args) {
		DC dc = new ObjectAdapter(new StandardAC());
		dc.outputDC();
	}

}
