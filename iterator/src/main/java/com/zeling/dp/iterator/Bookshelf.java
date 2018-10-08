package com.zeling.dp.iterator;

public class Bookshelf implements IAggregate {
	
	private Object[] books;
	
	private int capacity = 10;
	
	private int index = 0;
	
	public Bookshelf(int capacity) {
		this.capacity = capacity;
		books = new Object[capacity];
	}
	
	public Bookshelf() {
		books = new Object[capacity];
	}

	@Override
	public void add(Object o) {
		if (index >= capacity) {
			throw new RuntimeException("书架已满！");
		}
		books[index++] = o;
	}
	
	@Override
	public void removeLast() {
		if (index <= 0) {
			throw new RuntimeException("书架已空！");
		}
		books[index--] = null;
	}

	@Override
	public Object get(int i) {
		if (0 <= i && i < capacity && books[i] != null) {
			return books[i];
		} else {
			return null;
		}
	}

	@Override
	public IIterator iterator() {
		return new BookIterator(this);
	}

}
