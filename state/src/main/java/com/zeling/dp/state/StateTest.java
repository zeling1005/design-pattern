package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * 状态模式测试类
 * 
 * @author chenbd 2018年9月17日
 */
public class StateTest {

    public static void main(String[] args) {
    	// 具体使用状态
        Orange cyanOrange = new CyanOrange();
        // 创建环境
        OrangeStateManage orangeStateManage = new OrangeStateManage();
        // 设置状态并执行
        orangeStateManage.setState(cyanOrange);
        orangeStateManage.print();
    }
}
