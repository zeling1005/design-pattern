package com.zeling.dp.mediator;

/**
 * 租房中介
 * 
 * @author chenbd 2018年11月8日
 */
public class HouseMediator extends AbsMediator {

	@Override
	public void operation(AbsPerson person, String msg) {
		if (person instanceof Landlord) {
			// 房东
			for (AbsPerson renter : renters) {
				renter.getMsg(msg);
			}
		} else if (person instanceof Renter) {
			// 求租者
			for (AbsPerson landlord : landlords) {
				landlord.getMsg(msg);
			}
		}
	}

}
