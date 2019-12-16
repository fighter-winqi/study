package com.concurrency.designpattern.creational.simplefactory;

/**
 * <p>Title: Test</p>
 * <p>Description: 生成二维码测试类，实际中是应用层代码</p>
 * <p>Company: http://www.yinjiedu.com</p>
 * <p>Project: annotation</p>
 *
 * @author: WEIQI
 * @Date: 2019-11-24 22:47
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 这里我们申明了父类的实例指向了子类的实现
         * 问题：这里的qrCode实例是非常依赖于所要实现的子类的
         */
        // QrCode qrCode = new AliPayQRCode();
        // qrCode.produceQRCode();

        QRCodeFactory qrCodeFactory = new QRCodeFactory();

        QrCode qrCode = qrCodeFactory.getQRCodeUpgradeVersion(AliPayQRCode.class);

        if (qrCode == null) {
            return;
        }
        qrCode.produceQRCode();
    }
}
