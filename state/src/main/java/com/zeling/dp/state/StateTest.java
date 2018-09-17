package com.zeling.dp.state;

/**
 * 状态模式测试类</br>
 * 状态模式的状态改变是由环境角色（context），也就是系统自身选择改变的，系统可以在不同的时期内选择变换成不同状态
 * 
 * @author chenbd 2018年9月17日
 */
public class StateTest {

    public static void main(String[] args) {
        // 橘子树
        OrangeTree orangeTree = new OrangeTree();
        // 看看橘子怎么样了
        orangeTree.see();
        // 过了一段时间
        orangeTree.inTime();
        // 看看橘子怎么样了
        orangeTree.see();
    }
}
