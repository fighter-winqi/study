package com.concurrency.designpattern.behavioral.templatemethod;

/**
 * <p>Title: XiaomiProduct</p>
 * <p>Description: 上架小米手机</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-12-15 19:34
 * @Version: 1.0
 */
public class XiaomiProduct extends Product {
    /**
     * @description: 为商品命名
     * @auther: WEIQI
     * @date: 2019-12-15 19:20
     */
    @Override
    void denominateProduct() {
        System.out.println("商品名称为：小米 MIX");
    }

    /**
     * @description: 商品地址链接
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    @Override
    void productUrl() {
        System.out.println("地址为：https://www.mi.com");
    }

    /**
     * @description: 商品库存
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    @Override
    void productrepertory() {
        System.out.println("库存为：20001");
    }
}
