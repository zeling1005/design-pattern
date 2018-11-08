package com.zeling.dp.memento.special;

/**
 * 源对象，也就是需要保存状态的类
 * 
 * @author chenbd 2018年11月8日
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public IMemento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(IMemento memento) {
		if (memento instanceof Memento) {
			this.state =((Memento) memento).getState();
		}
	}
	
	private class Memento implements IMemento {
		/**
		 * 源对象的内部状态
		 */
		private String state;
		
		public String getState() {
			return state;
		}
		
		public Memento(String state) {
			this.state = state;
		}
	}
}
