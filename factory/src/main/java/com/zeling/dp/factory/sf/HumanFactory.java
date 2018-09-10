package com.zeling.dp.factory.sf;

/**
 * 简单工厂1
 * 
 * @author chenbd 2018年9月7日
 */
public class HumanFactory {

	public static IHuman createHuman(HumanType type) {
		switch (type) {
		case MAN:
			return new Man();
		case WOMAN:
			return new Woman();
		default:
			return null;
		}
	}

	public static enum HumanType {
		MAN() {
			@Override
			public String getType() {
				return "man";
			}
		},
		WOMAN() {
			@Override
			public String getType() {
				return "woman";
			}
		};
		public abstract String getType();

	}

}
