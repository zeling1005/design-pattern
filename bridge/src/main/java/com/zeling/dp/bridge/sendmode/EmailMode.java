package com.zeling.dp.bridge.sendmode;

import com.zeling.dp.bridge.base.ISendMode;

/**
 * 短信方式
 * 
 * @author chenbd 2018年9月28日
 */
public class EmailMode implements ISendMode {

	@Override
	public void sendMode() {
		System.out.println("使用微信...");
	}

}
