package com.zeling.dp.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 * 
 * @author chenbd 2018年11月8日
 */
public abstract class AbsMediator {
	protected List<AbsPerson> landlords = new ArrayList<>();
	protected List<AbsPerson> renters = new ArrayList<>();
	
	public void registerLandlord(AbsPerson landlord) {
		landlords.add(landlord);
		landlord.setMediator(this);
	}
	
	public void registerRenter(AbsPerson renter) {
		renters.add(renter);
		renter.setMediator(this);
	}
	
	/**
	 * 消息交互
	 * 
	 * @param person
	 * @param msg
	 */
	public abstract void operation(AbsPerson person, String msg);

}
