package com.zeling.dp.adapter.oa;

import com.zeling.dp.adapter.pub.DC;
import com.zeling.dp.adapter.pub.StandardAC;

/**
 * com.zeling.dp.adapter.pub.StandardAC对象适配器
 * 
 * @author chenbd 2018年9月26日
 */
public class ObjectAdapter implements DC {
	
	private StandardAC standardAC;
	
	public ObjectAdapter(StandardAC standardAC) {
		this.standardAC = standardAC;
	}
	
	@Override
	public void outputDC() {
		standardAC.outputAC();
		System.out.println("交流电转直流电...");
		System.out.println("标准直流电！");
	}
}
