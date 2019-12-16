package com.concurrency.designpattern.behavioral.templatemethod;

/**
 * <p>Title: TemeplateMethod</p>
 * <p>Description: 参照thread的run和start方法，写的一个小demo</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-12-17 0:45
 * @Version: 1.0
 */
public class TemeplateMethod {

    /**
     * @description: 输出用户输入的字符串信息，类似于thread中的start()
     * @auther: WEIQI
     * @date: 2019-12-17 0:56
     * @param inputString 用户输入字符串
     */
    public final void outputString(String inputString) {
        System.out.println("*******************");
        userInput(inputString);
        System.out.println("*******************");
        System.out.println();
    }

    /**
     * @description: 暴露给继承类的方法，类似于thread中的run()
     * @auther: WEIQI
     * @date: 2019-12-17 0:57
     * @param inputString 用户输入字符串
     */
    protected void userInput(String inputString) {
    }

    /**
     * @description: 编写简单的测试功能模块
     * @auther: WEIQI
     * @date: 2019-12-17 0:58
     */
    public static void main(String[] args) {
        // 对象引用1，类似于创建一个线程
        TemeplateMethod temeplateMethod1 = new TemeplateMethod(){
            @Override
            protected void userInput(String inputString) {
                System.out.println(inputString);
            }
        };
        // 第一个引用调用算法封装方法，类似于线程调用start()方法
        temeplateMethod1.outputString("user1 input data");

        // 对象引用2，类似于创建另外一个线程
        TemeplateMethod temeplateMethod2 = new TemeplateMethod(){
            @Override
            protected void userInput(String inputString) {
                System.out.println(inputString);
            }
        };
        // 第二个引用调用算法封装方法，类似于线程调用start()方法
        temeplateMethod2.outputString("user2 input data");
    }
}
