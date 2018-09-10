package com.zeling.dp.builder.free;

import com.zeling.dp.builder.pub.Robot;

/**
 * 自由的建造者接口
 * 
 * @author chenbd 2018年9月6日
 */
public interface IFreeBuilder {
	IFreeBuilder setHead(String head);
	IFreeBuilder setHand(String hand);
	IFreeBuilder setBody(String body);
	IFreeBuilder setFoot(String foot);
	Robot build();
}
