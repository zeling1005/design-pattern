package com.zeling.dp.adapter.ca;

import com.zeling.dp.adapter.pub.DC;
import com.zeling.dp.adapter.pub.StandardAC;

/**
 * com.zeling.dp.adapter.pub.StandardAC类适配器
 * 
 * @author chenbd 2018年9月26日
 */
public class ClassAdapter extends StandardAC implements DC {

	@Override
	public void outputDC() {
		outputAC();
		System.out.println("交流电转直流电...");
		System.out.println("标准直流电！");
	}

}
