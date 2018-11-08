package com.zeling.dp.mediator;

public class Client {

	public static void main(String[] args) {
		AbsMediator mediator = new HouseMediator();
		Renter renter = new Renter("小明");
		Landlord landlordLi = new Landlord("李先生");
		Landlord landlordZhang = new Landlord("张先生");
		
		// 注册
		mediator.registerLandlord(landlordLi);
		mediator.registerLandlord(landlordZhang);
		mediator.registerRenter(renter);
		
		renter.sendMsg("在天河公园附近租套房子，价格1000元左右一个月");
		landlordLi.sendMsg("天河公园学院站三巷27号四楼有一房一厅出租  1200/月  光线好 近公交站");
	}

}
