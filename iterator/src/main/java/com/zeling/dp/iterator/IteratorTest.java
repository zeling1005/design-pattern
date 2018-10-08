package com.zeling.dp.iterator;

/**
 * 迭代器模式测试
 * 
 * @author chenbd 2018年10月8日
 */
public class IteratorTest {

	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(new Book("一千零一夜"));
		bookshelf.add(new Book("java讲义"));
		bookshelf.add(new Book("数据结构"));
		IIterator iter = bookshelf.iterator();
		while (iter.hasNext()) {
			Book book = (Book)iter.next();
			System.out.println(book.getBookName());
		}
	}

}
