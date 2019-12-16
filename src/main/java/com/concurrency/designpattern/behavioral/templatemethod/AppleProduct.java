package com.concurrency.designpattern.behavioral.templatemethod;

/**
 * <p>Title: AppleProduct</p>
 * <p>Description: 上架apple手机 </p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-12-15 19:33
 * @Version: 1.0
 */
public class AppleProduct extends Product {

    private boolean allowAdjustPriceFlag = true;

    /**
     * @description: 为商品命名
     * @auther: WEIQI
     * @date: 2019-12-15 19:20
     */
    @Override
    void denominateProduct() {
        System.out.println("商品名称为：Apple xs");
    }

    /**
     * @description: 商品地址链接
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    @Override
    void productUrl() {
        System.out.println("地址为：https://www.apple.com");
    }

    /**
     * @description: 商品库存
     * @auther: WEIQI
     * @date: 2019-12-15 19:22
     */
    @Override
    void productrepertory() {
        System.out.println("库存为：20000");
    }

    /**
     * @description: 允许价格调整
     * @auther: WEIQI
     * @date: 2019-12-15 20:11
     * @return: boolean
     */
    @Override
    boolean isnotPermissionPriceAdjust() {
        return this.allowAdjustPriceFlag;
    }
}
