package com.zeling.dp.facade;

import com.zeling.dp.facade.submodule.Cpu;
import com.zeling.dp.facade.submodule.Disk;
import com.zeling.dp.facade.submodule.Memory;

/**
 * 电脑，facade模式的体现
 * 
 * @author chenbd 2018年9月28日
 */
public class Computer {
	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void start() {
		cpu.start();
		memory.start();
		disk.start();
	}
	public void shutdown() {
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
