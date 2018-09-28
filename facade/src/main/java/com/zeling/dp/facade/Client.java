package com.zeling.dp.facade;

import com.zeling.dp.facade.submodule.Cpu;
import com.zeling.dp.facade.submodule.Disk;
import com.zeling.dp.facade.submodule.Memory;

/**
 * 客户端
 * 
 * @author chenbd 2018年9月28日
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("facade pattern:");
		useFacadePattern();
		System.out.println("\n\nno use facade pattern:");
		nonFacadePattern();
	}
	
	/**
	 * 使用facade模式，只要修改Computer类就可以进行扩展，而暴露给外部的接口不变
	 */
	public static void useFacadePattern() {
		// 启动电脑
		Computer computer = new Computer();
		System.out.println("启动电脑");
		computer.start();
		
		// 关闭电脑
		System.out.println("关闭电脑");
		computer.shutdown();
	}
	
	/**
	 * 不使用facade模式，不易扩展
	 */
	public static void nonFacadePattern() {
		// 启动电脑，有顺序要求
		Cpu cpu = new Cpu();
		Memory memory = new Memory();
		Disk disk = new Disk();
		System.out.println("启动电脑");
		cpu.start();
		memory.start();
		disk.start();
		
		// 关闭电脑，有顺序要求
		System.out.println("关闭电脑");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}

}
