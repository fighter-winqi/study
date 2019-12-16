package com.concurrency.designpattern.behavioral.templatemethod;

/**
 * <p>Title: Product</p>
 * <p>Description: 商品上架准备算法封装</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-12-15 19:08
 * @Version: 1.0
 */
public abstract class Product {

    /**
     * @description: 制作商品
     * @auther: WEIQI
     * @date: 2019-12-15 21:03
     */
    protected final void makeProduct() {
        this.putaway();
        this.denominateProduct();
        this.obtainType();
        this.productUrl();
        this.productrepertory();
        if (isnotPermissionPriceAdjust()) {
            this.adjustPrice();
        }
    }

    /**
     * @description: 将商品上架到淘宝
     * @auther: WEIQI
     * @date: 2019-12-15 19:20
     */
    final void putaway() {
        System.out.println("上架商品到淘宝");
    }

    /**
     * @description: 获取商品类型
     * @auther: WEIQI
     * @date: 2019-12-15 19:29
     */
    final int obtainType() {
        Integer productType = 1;
        System.out.println("获取商品类型逻辑");
        return productType;
    }

    /**
     * @description: 为商品命名
     * @auther: WEIQI
     * @date: 2019-12-15 19:20
     */
    abstract void denominateProduct();

    /**
     * @description: 商品地址链接
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    abstract void productUrl();

    /**
     * @description: 商品库存
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    abstract void productrepertory();

    /**
     * @description: 是否允许价格调整，默认返回false （定义钩子 hook）
     * @auther: WEIQI
     * @date: 2019-12-15 20:11
     * @return: boolean
     */
    boolean isnotPermissionPriceAdjust() {
        return false;
    }

    /**
     * @description: 调整价格
     * @auther: WEIQI
     * @date: 2019-12-15 20:12
     */
    final void adjustPrice() {
        System.out.println("调整价格");
    }
}
