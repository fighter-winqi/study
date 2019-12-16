package com.concurrency.designpattern.creational.simplefactory;

/**
 * <p>Title: QRCodeFactory</p>
 * <p>Description: 定义简单工厂，创建获取二维码类实例方法</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-11-24 22:58
 * @Version: 1.0
 */
public class QRCodeFactory {

    /**
     * @description: 获取生成二维码实例
     * @auther: WEIQI
     * @date: 2019-11-24 23:01
     * @param qrType 二维码类型（传入值目前有支付宝、微信、京东）
     * @return:
     */
    public QrCode getQRCode(String qrType) {
        if ("alipay".equalsIgnoreCase(qrType)) {
            return new AliPayQRCode();
        } else if ("wechat".equalsIgnoreCase(qrType)) {
            return new WechatQRCode();
        } else if ("jd".equalsIgnoreCase(qrType)) {
            return new JdQRCode();
        }
        return null;
    }

    /**
     * @description: 使用反射对getQRCode()做优化
     * @auther: WEIQI
     * @date: 2019-11-24 23:18
     * @param clazz 类实例
     * @return:
     */
    public QrCode getQRCodeUpgradeVersion(Class clazz) {

        QrCode qrCode = null;

        try {
            qrCode = (QrCode) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return qrCode;
    }
}
