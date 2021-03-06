package com.vitoboy.leetcode;

import java.util.Stack;

/**
 * @Author: vito
 * @Date: 2020/6/19 13:32
 * @Version: 1.0
 *
 * 面试题09. 用两个栈实现队列
 * 用两个栈实现一个队列。
 *
 * 队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 *
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 */
public class VI_CQueue {

    // 入栈用的
    private Stack<Integer> input;
    // 出栈用的
    private Stack<Integer> output;

    public VI_CQueue() {
        this.input = new Stack<>();
        this.output = new Stack<>();
    }

    public void appendTail(int value) {
        // 如果出栈有值, 需要将值放回到入栈, 再将新值入栈
        if (output.size() > 0) {
            while (output.size() > 0) {
                input.push(output.pop());
            }
        }
        input.push(value);
    }

    public int deleteHead() {
        if (input.size() > 1) {
            while (input.size() > 1) {
                output.push(input.pop());
            }
            return input.pop();
        } else if (input.size() == 1) {
            return input.pop();
        }
        if (output.size() > 0) {
            return output.pop();
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
