package com.concurrency.designpattern.creational.simplefactory;

/**
 * <p>Title: QrCode</p>
 * <p>Description: 生成支付二维码公共方法定义</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-11-24 22:35
 * @Version: 1.0
 */
public abstract class QrCode {
    /**
     * @description: 生成支付二维码
     * @auther: WEIQI
     * @date: 2019-11-24 22:36
     * @param
     * @return:
     */
    public abstract void produceQRCode();
}
