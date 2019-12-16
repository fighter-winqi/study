package com.concurrency.designpattern.behavioral.templatemethod;

/**
 * <p>Title: Test</p>
 * <p>Description: 测试类</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-12-15 19:42
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        Product appleProduct = new AppleProduct();
        appleProduct.makeProduct();

        System.out.println("----------------------------------");
        Product xiaomiProduct = new XiaomiProduct();
        xiaomiProduct.makeProduct();
    }
}
