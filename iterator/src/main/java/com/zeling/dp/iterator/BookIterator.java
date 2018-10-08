package com.zeling.dp.iterator;

/**
 * 书的迭代器
 * 
 * @author chenbd 2018年10月8日
 */
public class BookIterator implements IIterator {
	
	private Bookshelf bookshelf;
	
	int index = 0;
	
	public BookIterator(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}
	
	@Override
	public boolean hasNext() {
		Object object = bookshelf.get(index);
		if (object != null) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return bookshelf.get(index++);
	}

}
