package com.zeling.dp.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * 家庭作业链
 * 
 * @author chenbd 2018年10月11日
 */
public class HomeworkChain implements IChain {
	private List<IHandler> handlers = new ArrayList<IHandler>();
	private int index = 0;
	
	public void addNextHandler(IHandler handler) {
		handlers.add(handler);
	}
	
	@Override
	public void doNext() {
		if (index == handlers.size()) {
			return;
		}
		handlers.get(index++).doHandle(this);
	}
}
